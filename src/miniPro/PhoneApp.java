package miniPro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
  //파일 읽어오기
		
		Reader fr = new FileReader("C:\\javaStudy\\강의자료\\java\\미니프로젝트\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		Scanner sc =new Scanner(System.in);
		
		
		List<phone> pList = new ArrayList<phone>();
		
  //읽어온걸 리스트에 넣기 
		
		while(true) {					
			String str = br.readLine();
			if(str==null) {
				break;
			}
			
			String[] a = str.split(",");
			
			
			phone b = new phone (a[0],a[1],a[2]);
			
			
			pList.add(b);
		}
		
		
		
		 System.out.println("****************************");
		 System.out.println("*     전화번호 관리 프로그램     *");
		 System.out.println("****************************");

		 
  //반복시작
		 while(true) {
			 System.out.println("");
			 System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			 System.out.println("------------------------------");
			 System.out.print(">메뉴번호: ");
			 int no = sc.nextInt();
			 

			 
			 if(no==1) {
				 
				 System.out.println("<1.리스트> ");
				 for(int i=0;i<pList.size();i++) {
					 System.out.print(i+1+".");
					 pList.get(i).showInfo();
				 }
				 
			 }else if(no==2) {
				 
				System.out.println("<2.등록> ");
				System.out.print(">이름: ");
				String name =sc.next();
				System.out.print(">휴대전화: ");
				String hp =sc.next();
				System.out.print(">회사전화: ");
				String company =sc.next();
				System.out.println("등록되었습니다.");
				 
				phone c = new phone (name, hp, company);
				 
				pList.add(c);
	  //덮어쓰기					 
				Writer w=new FileWriter("C:\\javaStudy\\강의자료\\java\\미니프로젝트\\PhoneDB.txt");
				BufferedWriter bw=new BufferedWriter(w);
		
				for(int i=0; i<pList.size(); i++) {//입력한값 텍스트 파일에 추가
					bw.write(String.valueOf(pList.get(i).enroll()));
					bw.newLine();
				}
				bw.close();
				 
			 }else if(no==3) {
			
				 System.out.println("<3.삭제> ");
				 System.out.print(">번호: ");
				 int num =sc.nextInt();
				 System.out.println("[삭제되었습니다.]");
				 
				 pList.remove(num-1);
		//덮어쓰기		 
				 Writer w=new FileWriter("C:\\javaStudy\\강의자료\\java\\미니프로젝트\\PhoneDB.txt");
					BufferedWriter bw=new BufferedWriter(w);
					
					for(int i=0; i<pList.size(); i++) {
						bw.write(String.valueOf(pList.get(i).enroll()));
						bw.newLine();
					}
					bw.close();
				 
				 
			 }else if(no==4) {
				 
				 System.out.println("<4.검색> ");
				 System.out.print(">이름: ");
				 String name =sc.next();
				 
				 for(int i =0;i<pList.size();i++) {
					 if(pList.get(i).getName().contains(name)) {
						 System.out.print(i+1+".");
						 System.out.println(pList.get(i).enroll());
					 }
					 
				 }
				
				
				 
			 }else if(no==5) {
				 System.out.println("****************************");
				 System.out.println("*         감사합니다.         *");
				 System.out.println("****************************");
				 break;
			 }else {
				 System.out.println("다시입력해주세요.");
			 }
			
			
			 
			 
	
			
			
			
			
			 
			 
		 }
		
		 
		
		
	}

}
