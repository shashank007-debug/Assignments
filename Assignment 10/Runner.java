public class Runner {
    public static void main(String[] args) {
		
        Balloon balloon1 = new Balloon();
        Balloon balloon2 = new Balloon("Blue");
        Balloon balloon3 = new Balloon("Green", "Mylar");
        Balloon balloon4 = new Balloon("Yellow", "Rubber", 10.0);
        Balloon balloon5 = new Balloon("Pink", "Plastic", 15.0, true);
        Balloon balloon6 = new Balloon("Purple", "Latex", 8.0, false, "Heart");
        Balloon balloon7 = new Balloon("Orange", "Foil", 20.0, true, "Star", 2);

        balloon1.display();
        balloon2.display();
        balloon3.display();
        balloon4.display();
        balloon5.display();
        balloon6.display();
        balloon7.display();
		System.out.println("==================================================================================================");
		
		Holi holi1 = new Holi();
        Holi holi2 = new Holi("Blue");
        Holi holi3 = new Holi("Green", "Festival of Colors");
        Holi holi4 = new Holi("Yellow", "Holi", true);
        Holi holi5 = new Holi("Pink", "Holi", false, 8);
        Holi holi6 = new Holi("Purple", "Holi", true, 6, "Family");
        Holi holi7 = new Holi("Orange", "Holi", false, 10, "Public", 500);

        holi1.display();
        holi2.display();
        holi3.display();
        holi4.display();
        holi5.display();
        holi6.display();
        holi7.display();
		System.out.println("==================================================================================================");
		
		Pichkari pichkari1 = new Pichkari();
        Pichkari pichkari2 = new Pichkari("Blue");
        Pichkari pichkari3 = new Pichkari("Green", 2.0);
        Pichkari pichkari4 = new Pichkari("Yellow", 1.0, "Metal");
        Pichkari pichkari5 = new Pichkari("Pink", 1.5, "Plastic", true);
        Pichkari pichkari6 = new Pichkari("Purple", 2.5, "Plastic", false, "High");
        Pichkari pichkari7 = new Pichkari("Orange", 3.0, "Metal", true, "Low", "HoliFun");

        pichkari1.display();
        pichkari2.display();
        pichkari3.display();
        pichkari4.display();
        pichkari5.display();
        pichkari6.display();
        pichkari7.display();
		System.out.println("==================================================================================================");

        Color color1 = new Color();
        Color color2 = new Color("Blue");
        Color color3 = new Color("Green", "Wet");
        Color color4 = new Color("Yellow", "Dry", false);
        Color color5 = new Color("Pink", "Wet", true, 75.0);
        Color color6 = new Color("Purple", "Dry", true, 60.0, 200);
        Color color7 = new Color("Orange", "Wet", false, 100.0, 500, "HoliColors");

        color1.display();
        color2.display();
        color3.display();
        color4.display();
        color5.display();
        color6.display();
        color7.display();
		System.out.println("==================================================================================================");
		
		Egg egg1 = new Egg();
        Egg egg2 = new Egg("Red");
        Egg egg3 = new Egg("Green", "Large");
        Egg egg4 = new Egg("Yellow", "Small", true);
        Egg egg5 = new Egg("Pink", "Medium", false, 60.0);
        Egg egg6 = new Egg("Purple", "Large", true, 70.0, "HoliFun");

        egg1.display();
        egg2.display();
        egg3.display();
        egg4.display();
        egg5.display();
        egg6.display();
		System.out.println("==================================================================================================");

        Bucket bucket1 = new Bucket();
        Bucket bucket2 = new Bucket("Red");
        Bucket bucket3 = new Bucket("Green", 15.0);
        Bucket bucket4 = new Bucket("Yellow", 20.0, "Metal");
        Bucket bucket5 = new Bucket("Pink", 12.0, "Plastic", "Metal");
        Bucket bucket6 = new Bucket("Purple", 25.0, "Plastic", "Plastic", "HoliFun");

        bucket1.display();
        bucket2.display();
        bucket3.display();
        bucket4.display();
        bucket5.display();
        bucket6.display();
		System.out.println("==================================================================================================");

        Tomato tomato1 = new Tomato();
        Tomato tomato2 = new Tomato("Yellow");
        Tomato tomato3 = new Tomato("Green", "Large");
        Tomato tomato4 = new Tomato("Pink", "Small", true);
        Tomato tomato5 = new Tomato("Purple", "Medium", false, 120.0);
        Tomato tomato6 = new Tomato("Orange", "Large", true, 150.0, "HoliFun");

        tomato1.display();
        tomato2.display();
        tomato3.display();
        tomato4.display();
        tomato5.display();
        tomato6.display();
		System.out.println("==================================================================================================");

        WaterBall waterBall1 = new WaterBall();
        WaterBall waterBall2 = new WaterBall("Red");
        WaterBall waterBall3 = new WaterBall("Green", "Large");
        WaterBall waterBall4 = new WaterBall("Yellow", "Small", true);
        WaterBall waterBall5 = new WaterBall("Pink", "Medium", false, 250.0);
        WaterBall waterBall6 = new WaterBall("Purple", "Large", true, 300.0, "HoliFun");

        waterBall1.display();
        waterBall2.display();
        waterBall3.display();
        waterBall4.display();
        waterBall5.display();
        waterBall6.display();
		System.out.println("==================================================================================================");
		
		Gun gun1 = new Gun();
        Gun gun2 = new Gun("Blue");
        Gun gun3 = new Gun("Green", "Rifle");
        Gun gun4 = new Gun("Yellow", "Machine Gun", true);
        Gun gun5 = new Gun("Pink", "Pistol", false, 20);
        Gun gun6 = new Gun("Purple", "Rifle", true, 30, "HoliFun");

        gun1.display();
        gun2.display();
        gun3.display();
        gun4.display();
        gun5.display();
        gun6.display();
		System.out.println("==================================================================================================");

        NailPolish nailPolish1 = new NailPolish();
        NailPolish nailPolish2 = new NailPolish("Blue");
        NailPolish nailPolish3 = new NailPolish("Green", "BrandX");
        NailPolish nailPolish4 = new NailPolish("Yellow", "BrandY", true);
        NailPolish nailPolish5 = new NailPolish("Pink", "BrandZ", false, 15.0);
        NailPolish nailPolish6 = new NailPolish("Purple", "BrandA", true, 20.0, 100.0);

        nailPolish1.display();
        nailPolish2.display();
        nailPolish3.display();
        nailPolish4.display();
        nailPolish5.display();
        nailPolish6.display();
		System.out.println("==================================================================================================");

        Water water1 = new Water();
        Water water2 = new Water("Bottled");
        Water water3 = new Water("Well", 2.0);
        Water water4 = new Water("Tap", 5.0, true);
        Water water5 = new Water("Bottled", 1.5, false, 6.5);
        Water water6 = new Water("Well", 3.0, true, 7.5, "HoliFun");

        water1.display();
        water2.display();
        water3.display();
        water4.display();
        water5.display();
        water6.display();
		System.out.println("==================================================================================================");
		
		
    }
}