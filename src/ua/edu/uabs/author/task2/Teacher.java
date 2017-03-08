package ua.edu.uabs.author.task2;

public class Teacher {
	private String FirstName, SecondName, LastName;
	private int stag, age;
	
	//Getter òà Setter ñòâîğåí³ äëÿ äîñòóï äî àòğèáóò³â(çì³ííèõ êëàñó) ç ³íøèõ êëàñ³â,
	//Getter äëÿ îòğèìàííÿ äàíèõ
	//SEtter äëÿ âñòàíîâëåííÿ äàíèõ
	//îñê³ëüêè ìîäèô³êàòîğ äîñòóïó ó öèõ ôóíêö³é public, à ó àòğèáóò³â private.
	//public äîñòóï ı º ûíøèõ êëàñ³â
	//private - äîñòóï º ò³ëüêè âñåğåäåí³ êëàñó
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}

	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public int getStag() {
		return stag;
	}
	public void setStag(int stag) {
		this.stag = stag;
	}

	public int getAge() {
		return age;
	}
	//Òóò º if ÷åğåç òå, ùî â³ê ìàº áóòè ì³æ 23 òà 70, ó ³íøèõ âèïàäêàõ ïğîãğàìà âèêëş÷èòüñÿ
	public void setAge(int age) {
		if(age>=23 && age<=70){
		this.age = age;
		}
		else{
		System.out.println("Çàäàíèé â³ê íåêîğåêòíèé.");
		System.exit(0);//Âèêëş÷èòü ïğîãğàìó
		}
	}

	//Ïóñòèé êîíñòğóêòî, ïğîñòî äëÿ ìîæëèâîñò³ ñòâîğåííÿ ïñòîãî åêçåìïëÿğó êëàñó, à äàí³ çàíîâèòè ÷åğåç Setters 
	public Teacher(){};
	
	//Êîíñòğóêòîğ ç ïàğàìåòğàìè âèêîğèñòîâóºòüñÿ äëÿ ñòâîğåííÿ êëàñó òà îäíî÷àñíîãî çàíåñåííÿ éîãî àòğèáóò³â
	public Teacher(String firstName, String secondName, String lastName, int stag, int age) {
		this.FirstName = firstName;
		this.SecondName = secondName;
		this.LastName = lastName;
		this.stag = stag;
		this.setAge(age);
	};
	
	//Âèâ³ä äàíèõ ó êîğîòê³é(âñ³ ñëîâà íàïèñàí³ ìàëèìè áóêâàìè) ôîğì³
	public void ShortOutput(){
		System.out.println("Âèêëàäà÷: "+LastName+" "+FirstName+" "+SecondName+", â³ê: "+age+", ñòàæ: "+stag+" ğîêè.");
	}
	
	//Âèâ³ä äàíèõ ó ïîâí³é(âñ³ ñëîâà ïî÷èíàşòüñÿ ç âåëèêî¿, à çíà÷åííÿ çì³ííèõ âèâîäèòü âåëèêèìè ÷åğ êîìàíäó .toUpperCase()) ôîğì³
	public void UpperOutput(){
		System.out.println("ÂÈÊËÀÄÀ×: "+LastName.toUpperCase()+" "+FirstName.toUpperCase()+" "+SecondName.toUpperCase()+", Â²Ê: "+age+", ÑÒÀÆ: "+stag+" ĞÎÊÈ.");
	}
	
}
