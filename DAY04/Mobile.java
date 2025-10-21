class Mobile{
	//default and parameterized construtor
	String brand;
	int price;
	String color;

	/*//defaoult construtor
	Mobile(){
		brand = "Samsaug";
		price = 1234;
		color = "pink";
	}
	*/

	//parameteriezed construtor

	Mobile(String b,int p, String c){
		brand = b;
		price = p;
		color = c;
	}
	void display(){
		System.out.println(brand + price + color);
	}
	public static void main(String[] args){
		//Mobile m1 = new Mobile();
		Mobile m2 = new Mobile("apple" , 98765,"white");
		//m1.display();
		m2.display();
	}
}
