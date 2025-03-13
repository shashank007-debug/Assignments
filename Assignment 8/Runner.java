class Runner{
	 public static void main(String[] args) {
        //Bottle Instance   
        Bottle bottle1 = new Bottle();
        Bottle bottle2 = new Bottle();
        Bottle bottle3 = new Bottle();
        Bottle bottle4 = new Bottle();
        Bottle bottle5 = new Bottle();

        bottle1.material = "Plastic"; bottle1.volume = 1.0; bottle1.color = "Black"; bottle1.insulated = false;
        bottle2.material = "Glass"; bottle2.volume = 0.5; bottle2.color = "Blue"; bottle2.insulated = true;
        bottle3.material = "Metal"; bottle3.volume = 2.0; bottle3.color = "Silver"; bottle3.insulated = true;
        bottle4.material = "Plastic"; bottle4.volume = 1.5; bottle4.color = "Red"; bottle4.insulated = false;
        bottle5.material = "Steel"; bottle5.volume = 1.2; bottle5.color = "Green"; bottle5.insulated = true;

        System.out.println("Bottle 1: " + bottle1.material + ", " + bottle1.volume + "L, " + bottle1.color + ", Insulated: " + bottle1.insulated);
        System.out.println("Bottle 2: " + bottle2.material + ", " + bottle2.volume + "L, " + bottle2.color + ", Insulated: " + bottle2.insulated);
        System.out.println("Bottle 3: " + bottle3.material + ", " + bottle3.volume + "L, " + bottle3.color + ", Insulated: " + bottle3.insulated);
        System.out.println("Bottle 4: " + bottle4.material + ", " + bottle4.volume + "L, " + bottle4.color + ", Insulated: " + bottle4.insulated);
        System.out.println("Bottle 5: " + bottle5.material + ", " + bottle5.volume + "L, " + bottle5.color + ", Insulated: " + bottle5.insulated);
        System.out.println("============================================================================");

        // Bag Instances
        Bag bag1 = new Bag();
        Bag bag2 = new Bag();
        Bag bag3 = new Bag();
        Bag bag4 = new Bag();
        Bag bag5 = new Bag();

        bag1.brand = "Nike"; bag1.color = "Black"; bag1.size = 20.0; bag1.waterproof = true;
        bag2.brand = "Adidas"; bag2.color = "Red"; bag2.size = 15.0; bag2.waterproof = false;
        bag3.brand = "Puma"; bag3.color = "Blue"; bag3.size = 25.0; bag3.waterproof = true;
        bag4.brand = "Reebok"; bag4.color = "Green"; bag4.size = 22.0; bag4.waterproof = false;
        bag5.brand = "Under Armour"; bag5.color = "Grey"; bag5.size = 18.0; bag5.waterproof = true;

        System.out.println("Bag 1: " + bag1.brand + ", " + bag1.color + ", Size: " + bag1.size + "L, Waterproof: " + bag1.waterproof);
        System.out.println("Bag 2: " + bag2.brand + ", " + bag2.color + ", Size: " + bag2.size + "L, Waterproof: " + bag2.waterproof);
        System.out.println("Bag 3: " + bag3.brand + ", " + bag3.color + ", Size: " + bag3.size + "L, Waterproof: " + bag3.waterproof);
        System.out.println("Bag 4: " + bag4.brand + ", " + bag4.color + ", Size: " + bag4.size + "L, Waterproof: " + bag4.waterproof);
        System.out.println("Bag 5: " + bag5.brand + ", " + bag5.color + ", Size: " + bag5.size + "L, Waterproof: " + bag5.waterproof);
        System.out.println("============================================================================");

        // Metro Instances
        Metro metro1 = new Metro();
        Metro metro2 = new Metro();
        Metro metro3 = new Metro();
        Metro metro4 = new Metro();
        Metro metro5 = new Metro();

        metro1.lineName = "Red Line"; metro1.capacity = 500; metro1.speed = 80.5; metro1.operational = true;
        metro2.lineName = "Blue Line"; metro2.capacity = 600; metro2.speed = 85.0; metro2.operational = true;
        metro3.lineName = "Green Line"; metro3.capacity = 400; metro3.speed = 75.0; metro3.operational = false;
        metro4.lineName = "Yellow Line"; metro4.capacity = 550; metro4.speed = 82.5; metro4.operational = true;
        metro5.lineName = "Purple Line"; metro5.capacity = 450; metro5.speed = 78.0; metro5.operational = false;

        System.out.println("Metro 1: " + metro1.lineName + ", Capacity: " + metro1.capacity + ", Speed: " + metro1.speed + " km/h, Operational: " + metro1.operational);
        System.out.println("Metro 2: " + metro2.lineName + ", Capacity: " + metro2.capacity + ", Speed: " + metro2.speed + " km/h, Operational: " + metro2.operational);
        System.out.println("Metro 3: " + metro3.lineName + ", Capacity: " + metro3.capacity + ", Speed: " + metro3.speed + " km/h, Operational: " + metro3.operational);
        System.out.println("Metro 4: " + metro4.lineName + ", Capacity: " + metro4.capacity + ", Speed: " + metro4.speed + " km/h, Operational: " + metro4.operational);
        System.out.println("Metro 5: " + metro5.lineName + ", Capacity: " + metro5.capacity + ", Speed: " + metro5.speed + " km/h, Operational: " + metro5.operational);
        System.out.println("============================================================================");
		
		//Industry Instance
		Industry industry1 = new Industry();
        Industry industry2 = new Industry();
        Industry industry3 = new Industry();
        Industry industry4 = new Industry();
        Industry industry5 = new Industry();

        industry1.name = "Textile"; industry1.workers = 500; industry1.revenue = 1.5; industry1.active = true;
        industry2.name = "Automobile"; industry2.workers = 1000; industry2.revenue = 5.0; industry2.active = false;
        industry3.name = "IT"; industry3.workers = 2000; industry3.revenue = 10.0; industry3.active = true;
        industry4.name = "Pharma"; industry4.workers = 800; industry4.revenue = 3.0; industry4.active = true;
        industry5.name = "Steel"; industry5.workers = 1200; industry5.revenue = 7.0; industry5.active = false;

        System.out.println("Industry 1: " + industry1.name + ", Workers: " + industry1.workers + ", Revenue: $" + industry1.revenue + "B, Active: " + industry1.active);
        System.out.println("Industry 2: " + industry2.name + ", Workers: " + industry2.workers + ", Revenue: $" + industry2.revenue + "B, Active: " + industry2.active);
        System.out.println("Industry 3: " + industry3.name + ", Workers: " + industry3.workers + ", Revenue: $" + industry3.revenue + "B, Active: " + industry3.active);
        System.out.println("Industry 4: " + industry4.name + ", Workers: " + industry4.workers + ", Revenue: $" + industry4.revenue + "B, Active: " + industry4.active);
        System.out.println("Industry 5: " + industry5.name + ", Workers: " + industry5.workers + ", Revenue: $" + industry5.revenue + "B, Active: " + industry5.active);
        System.out.println("============================================================================");
		
		//PowerBank Instance
		PowerBank power1 = new PowerBank();
        PowerBank power2 = new PowerBank();
        PowerBank power3 = new PowerBank();
        PowerBank power4 = new PowerBank();
        PowerBank power5 = new PowerBank();

        power1.brand = "Anker"; power1.capacity = 10000; power1.color = "Black"; power1.fastCharging = true;
        power2.brand = "Xiaomi"; power2.capacity = 20000; power2.color = "Red"; power2.fastCharging = false;
        power3.brand = "Samsung"; power3.capacity = 15000; power3.color = "Blue"; power3.fastCharging = true;
        power4.brand = "OnePlus"; power4.capacity = 25000; power4.color = "Silver"; power4.fastCharging = false;
        power5.brand = "Apple"; power5.capacity = 30000; power5.color = "White"; power5.fastCharging = true;

        System.out.println("PowerBank 1: " + power1.brand + ", Capacity: " + power1.capacity + "mAh, Color: " + power1.color + ", Fast Charging: " + power1.fastCharging);
        System.out.println("PowerBank 2: " + power2.brand + ", Capacity: " + power2.capacity + "mAh, Color: " + power2.color + ", Fast Charging: " + power2.fastCharging);
        System.out.println("PowerBank 3: " + power3.brand + ", Capacity: " + power3.capacity + "mAh, Color: " + power3.color + ", Fast Charging: " + power3.fastCharging);
        System.out.println("PowerBank 4: " + power4.brand + ", Capacity: " + power4.capacity + "mAh, Color: " + power4.color + ", Fast Charging: " + power4.fastCharging);
        System.out.println("PowerBank 5: " + power5.brand + ", Capacity: " + power5.capacity + "mAh, Color: " + power5.color + ", Fast Charging: " + power5.fastCharging);
        System.out.println("============================================================================");
		
		// Star Instances
        Star star1 = new Star();
        Star star2 = new Star();
        Star star3 = new Star();
        Star star4 = new Star();
        Star star5 = new Star();

        star1.name = "Sun"; star1.temperature = 5778; star1.mass = 1.989E30; star1.visible = true;
        star2.name = "Sirius"; star2.temperature = 9940; star2.mass = 2.02E30; star2.visible = true;
        star3.name = "Betelgeuse"; star3.temperature = 3500; star3.mass = 20.0E30; star3.visible = false;
        star4.name = "Proxima Centauri"; star4.temperature = 3042; star4.mass = 0.123E30; star4.visible = true;
        star5.name = "Vega"; star5.temperature = 9602; star5.mass = 2.135E30; star5.visible = true;

        System.out.println("Star 1: " + star1.name + ", Temp: " + star1.temperature + "K, Mass: " + star1.mass + "kg, Visible: " + star1.visible);
        System.out.println("Star 2: " + star2.name + ", Temp: " + star2.temperature + "K, Mass: " + star2.mass + "kg, Visible: " + star2.visible);
        System.out.println("Star 3: " + star3.name + ", Temp: " + star3.temperature + "K, Mass: " + star3.mass + "kg, Visible: " + star3.visible);
        System.out.println("Star 4: " + star4.name + ", Temp: " + star4.temperature + "K, Mass: " + star4.mass + "kg, Visible: " + star4.visible);
        System.out.println("Star 5: " + star5.name + ", Temp: " + star5.temperature + "K, Mass: " + star5.mass + "kg, Visible: " + star5.visible);
        System.out.println("============================================================================");
		
		//Lamp Instance
		Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();
        Lamp lamp3 = new Lamp();
        Lamp lamp4 = new Lamp();
        Lamp lamp5 = new Lamp();

        lamp1.type = "LED"; lamp1.brightness = 800; lamp1.color = "White"; lamp1.isOn = true;
        lamp2.type = "Incandescent"; lamp2.brightness = 600; lamp2.color = "Yellow"; lamp2.isOn = false;
        lamp3.type = "Halogen"; lamp3.brightness = 1000; lamp3.color = "Warm White"; lamp3.isOn = true;
        lamp4.type = "Fluorescent"; lamp4.brightness = 700; lamp4.color = "Cool White"; lamp4.isOn = false;
        lamp5.type = "Smart"; lamp5.brightness = 1200; lamp5.color = "RGB"; lamp5.isOn = true;

        System.out.println("Lamp 1: " + lamp1.type + ", Brightness: " + lamp1.brightness + " lumens, Color: " + lamp1.color + ", On: " + lamp1.isOn);
        System.out.println("Lamp 2: " + lamp2.type + ", Brightness: " + lamp2.brightness + " lumens, Color: " + lamp2.color + ", On: " + lamp2.isOn);
        System.out.println("Lamp 3: " + lamp3.type + ", Brightness: " + lamp3.brightness + " lumens, Color: " + lamp3.color + ", On: " + lamp3.isOn);
        System.out.println("Lamp 4: " + lamp4.type + ", Brightness: " + lamp4.brightness + " lumens, Color: " + lamp4.color + ", On: " + lamp4.isOn);
        System.out.println("Lamp 5: " + lamp5.type + ", Brightness: " + lamp5.brightness + " lumens, Color: " + lamp5.color + ", On: " + lamp5.isOn);
        System.out.println("============================================================================");
		
		 // Earth Instances
        Earth earth1 = new Earth();
        Earth earth2 = new Earth();
        Earth earth3 = new Earth();
        Earth earth4 = new Earth();
        Earth earth5 = new Earth();

        earth1.continent = "Asia"; earth1.ocean = "Pacific"; earth1.population = 4600000000L; earth1.isHabitable = true;
        earth2.continent = "Europe"; earth2.ocean = "Atlantic"; earth2.population = 747000000L; earth2.isHabitable = true;
        earth3.continent = "Africa"; earth3.ocean = "Indian"; earth3.population = 1340000000L; earth3.isHabitable = true;
        earth4.continent = "North America"; earth4.ocean = "Arctic"; earth4.population = 592000000L; earth4.isHabitable = true;
        earth5.continent = "Antarctica"; earth5.ocean = "Southern"; earth5.population = 1000L; earth5.isHabitable = false;

        System.out.println("Earth 1: " + earth1.continent + ", Ocean: " + earth1.ocean + ", Population: " + earth1.population + ", Habitable: " + earth1.isHabitable);
        System.out.println("Earth 2: " + earth2.continent + ", Ocean: " + earth2.ocean + ", Population: " + earth2.population + ", Habitable: " + earth2.isHabitable);
        System.out.println("Earth 3: " + earth3.continent + ", Ocean: " + earth3.ocean + ", Population: " + earth3.population + ", Habitable: " + earth3.isHabitable);
        System.out.println("Earth 4: " + earth4.continent + ", Ocean: " + earth4.ocean + ", Population: " + earth4.population + ", Habitable: " + earth4.isHabitable);
        System.out.println("Earth 5: " + earth5.continent + ", Ocean: " + earth5.ocean + ", Population: " + earth5.population + ", Habitable: " + earth5.isHabitable);
        System.out.println("============================================================================");
		
		//Bullet Instance
		Bullet bullet1 = new Bullet();
        Bullet bullet2 = new Bullet();
        Bullet bullet3 = new Bullet();
        Bullet bullet4 = new Bullet();
        Bullet bullet5 = new Bullet();

        bullet1.type = "9mm"; bullet1.weight = 7.5; bullet1.speed = 350; bullet1.explosive = false;
        bullet2.type = "5.56mm"; bullet2.weight = 4.0; bullet2.speed = 950; bullet2.explosive = false;
        bullet3.type = "7.62mm"; bullet3.weight = 10.0; bullet3.speed = 830; bullet3.explosive = true;
        bullet4.type = "12.7mm"; bullet4.weight = 43.0; bullet4.speed = 900; bullet4.explosive = true;
        bullet5.type = "Shotgun Shell"; bullet5.weight = 24.0; bullet5.speed = 400; bullet5.explosive = false;

        System.out.println("Bullet 1: " + bullet1.type + ", Weight: " + bullet1.weight + "g, Speed: " + bullet1.speed + "m/s, Explosive: " + bullet1.explosive);
        System.out.println("Bullet 2: " + bullet2.type + ", Weight: " + bullet2.weight + "g, Speed: " + bullet2.speed + "m/s, Explosive: " + bullet2.explosive);
        System.out.println("Bullet 3: " + bullet3.type + ", Weight: " + bullet3.weight + "g, Speed: " + bullet3.speed + "m/s, Explosive: " + bullet3.explosive);
        System.out.println("Bullet 4: " + bullet4.type + ", Weight: " + bullet4.weight + "g, Speed: " + bullet4.speed + "m/s, Explosive: " + bullet4.explosive);
        System.out.println("Bullet 5: " + bullet5.type + ", Weight: " + bullet5.weight + "g, Speed: " + bullet5.speed + "m/s, Explosive: " + bullet5.explosive);
        System.out.println("============================================================================");
		
		// Flag Instances
        Flag flag1 = new Flag();
        Flag flag2 = new Flag();
        Flag flag3 = new Flag();
        Flag flag4 = new Flag();
        Flag flag5 = new Flag();

        flag1.country = "USA"; flag1.color = "Red, White, Blue"; flag1.height = 5; flag1.symbol = "Stars & Stripes";
        flag2.country = "India"; flag2.color = "Saffron, White, Green"; flag2.height = 6; flag2.symbol = "Ashoka Chakra";
        flag3.country = "Japan"; flag3.color = "White, Red"; flag3.height = 4; flag3.symbol = "Red Circle";
        flag4.country = "Germany"; flag4.color = "Black, Red, Yellow"; flag4.height = 7; flag4.symbol = "Horizontal Stripes";
        flag5.country = "Brazil"; flag5.color = "Green, Yellow, Blue"; flag5.height = 8; flag5.symbol = "Globe & Stars";

        System.out.println("Flag 1: " + flag1.country + ", Color: " + flag1.color + ", Height: " + flag1.height + "m, Symbol: " + flag1.symbol);
        System.out.println("Flag 2: " + flag2.country + ", Color: " + flag2.color + ", Height: " + flag2.height + "m, Symbol: " + flag2.symbol);
        System.out.println("Flag 3: " + flag3.country + ", Color: " + flag3.color + ", Height: " + flag3.height + "m, Symbol: " + flag3.symbol);
        System.out.println("Flag 4: " + flag4.country + ", Color: " + flag4.color + ", Height: " + flag4.height + "m, Symbol: " + flag4.symbol);
        System.out.println("Flag 5: " + flag5.country + ", Color: " + flag5.color + ", Height: " + flag5.height + "m, Symbol: " + flag5.symbol);
        System.out.println("============================================================================");
	
		//Chocolate Instance
		Chocolate chocolate1 = new Chocolate();
        Chocolate chocolate2 = new Chocolate();
        Chocolate chocolate3 = new Chocolate();
        Chocolate chocolate4 = new Chocolate();
        Chocolate chocolate5 = new Chocolate();

        chocolate1.brand = "Cadbury"; chocolate1.type = "Milk Chocolate"; chocolate1.weight = 100; chocolate1.sweet = true;
        chocolate2.brand = "Lindt"; chocolate2.type = "Dark Chocolate"; chocolate2.weight = 150; chocolate2.sweet = false;
        chocolate3.brand = "Hershey's"; chocolate3.type = "White Chocolate"; chocolate3.weight = 120; chocolate3.sweet = true;
        chocolate4.brand = "Ferrero Rocher"; chocolate4.type = "Hazelnut Chocolate"; chocolate4.weight = 200; chocolate4.sweet = true;
        chocolate5.brand = "Toblerone"; chocolate5.type = "Swiss Chocolate"; chocolate5.weight = 250; chocolate5.sweet = true;

        System.out.println("Chocolate 1: " + chocolate1.brand + ", Type: " + chocolate1.type + ", Weight: " + chocolate1.weight + "g, Sweet: " + chocolate1.sweet);
        System.out.println("Chocolate 2: " + chocolate2.brand + ", Type: " + chocolate2.type + ", Weight: " + chocolate2.weight + "g, Sweet: " + chocolate2.sweet);
        System.out.println("Chocolate 3: " + chocolate3.brand + ", Type: " + chocolate3.type + ", Weight: " + chocolate3.weight + "g, Sweet: " + chocolate3.sweet);
        System.out.println("Chocolate 4: " + chocolate4.brand + ", Type: " + chocolate4.type + ", Weight: " + chocolate4.weight + "g, Sweet: " + chocolate4.sweet);
        System.out.println("Chocolate 5: " + chocolate5.brand + ", Type: " + chocolate5.type + ", Weight: " + chocolate5.weight + "g, Sweet: " + chocolate5.sweet);
        System.out.println("============================================================================");
		
		//Camera Instance
		Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        Camera camera3 = new Camera();
        Camera camera4 = new Camera();
        Camera camera5 = new Camera();

        camera1.brand = "Canon"; camera1.resolution = 24; camera1.zoom = 10; camera1.digital = true;
        camera2.brand = "Nikon"; camera2.resolution = 30; camera2.zoom = 15; camera2.digital = true;
        camera3.brand = "Sony"; camera3.resolution = 40; camera3.zoom = 20; camera3.digital = true;
        camera4.brand = "Fujifilm"; camera4.resolution = 12; camera4.zoom = 5; camera4.digital = false;
        camera5.brand = "GoPro"; camera5.resolution = 16; camera5.zoom = 8; camera5.digital = true;

        System.out.println("Camera 1: " + camera1.brand + ", Resolution: " + camera1.resolution + "MP, Zoom: " + camera1.zoom + "x, Digital: " + camera1.digital);
        System.out.println("Camera 2: " + camera2.brand + ", Resolution: " + camera2.resolution + "MP, Zoom: " + camera2.zoom + "x, Digital: " + camera2.digital);
        System.out.println("Camera 3: " + camera3.brand + ", Resolution: " + camera3.resolution + "MP, Zoom: " + camera3.zoom + "x, Digital: " + camera3.digital);
        System.out.println("Camera 4: " + camera4.brand + ", Resolution: " + camera4.resolution + "MP, Zoom: " + camera4.zoom + "x, Digital: " + camera4.digital);
        System.out.println("Camera 5: " + camera5.brand + ", Resolution: " + camera5.resolution + "MP, Zoom: " + camera5.zoom + "x, Digital: " + camera5.digital);
        System.out.println("============================================================================");
		
		// Train Instances
        Train train1 = new Train();
        Train train2 = new Train();
        Train train3 = new Train();
        Train train4 = new Train();
        Train train5 = new Train();

        train1.name = "Bullet Train"; train1.speed = 300; train1.capacity = 600; train1.electric = true;
        train2.name = "Metro"; train2.speed = 100; train2.capacity = 1000; train2.electric = true;
        train3.name = "Freight Train"; train3.speed = 80; train3.capacity = 5000; train3.electric = false;
        train4.name = "Passenger Train"; train4.speed = 120; train4.capacity = 800; train4.electric = false;
        train5.name = "Maglev"; train5.speed = 500; train5.capacity = 700; train5.electric = true;

        System.out.println("Train 1: " + train1.name + ", Speed: " + train1.speed + " km/h, Capacity: " + train1.capacity + ", Electric: " + train1.electric);
        System.out.println("Train 2: " + train2.name + ", Speed: " + train2.speed + " km/h, Capacity: " + train2.capacity + ", Electric: " + train2.electric);
        System.out.println("Train 3: " + train3.name + ", Speed: " + train3.speed + " km/h, Capacity: " + train3.capacity + ", Electric: " + train3.electric);
        System.out.println("Train 4: " + train4.name + ", Speed: " + train4.speed + " km/h, Capacity: " + train4.capacity + ", Electric: " + train4.electric);
        System.out.println("Train 5: " + train5.name + ", Speed: " + train5.speed + " km/h, Capacity: " + train5.capacity + ", Electric: " + train5.electric);
        System.out.println("============================================================================");
		
		//Road Instance
		Road road1 = new Road();
        Road road2 = new Road();
        Road road3 = new Road();
        Road road4 = new Road();
        Road road5 = new Road();

        road1.type = "Highway"; road1.length = 500; road1.lanes = 6; road1.paved = true;
        road2.type = "Street"; road2.length = 5; road2.lanes = 2; road2.paved = true;
        road3.type = "Dirt Road"; road3.length = 10; road3.lanes = 1; road3.paved = false;
        road4.type = "Expressway"; road4.length = 100; road4.lanes = 4; road4.paved = true;
        road5.type = "Alley"; road5.length = 1; road5.lanes = 1; road5.paved = true;
		
		System.out.println("Road 1: Type - " + road1.type + ", Length - " + road1.length + " km, Lanes - " + road1.lanes + ", Paved - " + road1.paved);
		System.out.println("Road 2: Type - " + road2.type + ", Length - " + road2.length + " km, Lanes - " + road2.lanes + ", Paved - " + road2.paved);
		System.out.println("Road 3: Type - " + road3.type + ", Length - " + road3.length + " km, Lanes - " + road3.lanes + ", Paved - " + road3.paved);
		System.out.println("Road 4: Type - " + road4.type + ", Length - " + road4.length + " km, Lanes - " + road4.lanes + ", Paved - " + road4.paved);
		System.out.println("Road 5: Type - " + road5.type + ", Length - " + road5.length + " km, Lanes - " + road5.lanes + ", Paved - " + road5.paved);
		System.out.println("============================================================================");

		
		

	 }
}