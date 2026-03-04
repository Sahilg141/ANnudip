//1. Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.

// Superclass
class HillStations
{
    void location()
    {
        System.out.println("Location of Hill Station");
    }

    void famousFor()
    {
        System.out.println("Famous for");
    }
}

// Subclass 1
class Manali extends HillStations
{
    void location()
    {
        System.out.println("Manali is in Himachal Pradesh");
    }

    void famousFor()
    {
        System.out.println("Manali is famous for Snowfall and Adventure Sports");
    }
}

// Subclass 2
class Mussoorie extends HillStations
{
    void location()
    {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    void famousFor()
    {
        System.out.println("Mussoorie is famous for Hills and Waterfalls");
    }
}

// Subclass 3
class Gulmarg extends HillStations
{
    void location()
    {
        System.out.println("Gulmarg is in Jammu and Kashmir");
    }

    void famousFor()
    {
        System.out.println("Gulmarg is famous for Skiing");
    }
}

// Main Class
class TestHillStations
{
    public static void main(String[] args)
    {
        // i) Parent class reference (Runtime Polymorphism)
        HillStations h;

        h = new Manali();
        h.location();
        h.famousFor();

        h = new Mussoorie();
        h.location();
        h.famousFor();

        h = new Gulmarg();
        h.location();
        h.famousFor();

        System.out.println("----------------------");

        // ii) Calling using subclass objects
        Manali m = new Manali();
        m.location();
        m.famousFor();

        Mussoorie ms = new Mussoorie();
        ms.location();
        ms.famousFor();

        Gulmarg g = new Gulmarg();
        g.location();
        g.famousFor();
    }
}

//output 

Manali is in Himachal Pradesh
Manali is famous for Snowfall and Adventure Sports
Mussoorie is in Uttarakhand
Mussoorie is famous for Hills and Waterfalls
Gulmarg is in Jammu and Kashmir
Gulmarg is famous for Skiing
----------------------
Manali is in Himachal Pradesh
Manali is famous for Snowfall and Adventure Sports
Mussoorie is in Uttarakhand
Mussoorie is famous for Hills and Waterfalls
Gulmarg is in Jammu and Kashmir
Gulmarg is famous for Skiing