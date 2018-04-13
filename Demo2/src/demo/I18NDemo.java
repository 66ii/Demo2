package demo;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18NDemo {
	public static void main(String[] args){
		//loc();
		//ademo();
		//formatDemo();
		i18n();
	}
	
	public static void ademo(){
		Locale locales[]=Locale.getAvailableLocales();
		for(int i =0;i<locales.length;i++){
			System.out.println(locales[i].getDisplayCountry()+"="
					+locales[i] .getCountry()+""
					+locales[i].getDisplayLanguage()+"="
					+locales[i].getLanguage()
					);
		}
	}
	
	public static void formatDemo(){
		String info = "ѧ����{0}��������{1}";
		String res = MessageFormat.format(info, 1L,"zhangsan",45);
		System.out.println(res);
	}
	
	public static void i18n(){
		ResourceBundle bundle = ResourceBundle.getBundle("demo.msg");
		String id = bundle.getString("id");
		System.out.println(id);
	}
	
	public static void loc(){
		Locale loc = Locale.getDefault();
		System.out.println(loc);
	}
	public static void inCn(){
		System.out.println("ѧ��");
		System.out.println("��Ϣ");
	}
	
	public static void inAf(){
		System.out.println("id");
		System.out.println("message");
	}
}
