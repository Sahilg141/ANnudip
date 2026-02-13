// default constructor 

package task1_java;

public class vehicle 
{

	 int number;
	 String text;
	  
	
	public static void main(String[] args) 
	 {
		   
	    vehicle obj = new vehicle(); 
	    System.out.println(obj.number); 
		System.out.println(obj.text); 
	    
	   
	}

}

/* output 

0
null

\*

// parameterized constructor

package task1_java;

class laptop {

    String brand;
    int ram;
    int price;

    laptop(String b, int r, int p) {
        brand = b;
        ram = r;
        price = p;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {

        laptop l1 = new laptop("Lenovo", 16, 55000);
        laptop l2 = new laptop("Asus", 8, 42000);

        l1.displayDetails();
        System.out.println("-----------");
        l2.displayDetails();
    }
}

/* output

Brand: Lenovo
RAM: 16GB
Price: ₹55000
-----------
Brand: Asus
RAM: 8GB
Price: ₹42000

*\







