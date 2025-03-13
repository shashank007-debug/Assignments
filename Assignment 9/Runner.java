public class Runner {
    public static void main(String[] args) {
		Festival festival1 = new Festival("Onam", "Ramzan", "Deepavali");
        Festival festival2 = new Festival("Diwali", "Holi", "Christmas");
        Festival festival3 = new Festival("Eid", "Pongal", "Navratri");
        Festival festival4 = new Festival("Baisakhi", "Ganesh Chaturthi", "Durga Puja");
        Festival festival5 = new Festival("Makar Sankranti", "Raksha Bandhan", "Janmashtami");

        System.out.println("Festival 1: " + festival1.var1 + ", " + festival1.var2 + ", " + festival1.var3);
        System.out.println("Festival 2: " + festival2.var1 + ", " + festival2.var2 + ", " + festival2.var3);
        System.out.println("Festival 3: " + festival3.var1 + ", " + festival3.var2 + ", " + festival3.var3);
        System.out.println("Festival 4: " + festival4.var1 + ", " + festival4.var2 + ", " + festival4.var3);
        System.out.println("Festival 5: " + festival5.var1 + ", " + festival5.var2 + ", " + festival5.var3);
        System.out.println("-----------------------------");

        Chat chat1 = new Chat("WhatsApp", "Telegram", "Signal");
        Chat chat2 = new Chat("Slack", "Discord", "Microsoft Teams");
        Chat chat3 = new Chat("Zoom", "Google Meet", "Skype");
        Chat chat4 = new Chat("WeChat", "Line", "Viber");
        Chat chat5 = new Chat("Hangouts", "Messenger", "Snapchat");

        System.out.println("Chat 1: " + chat1.var1 + ", " + chat1.var2 + ", " + chat1.var3);
        System.out.println("Chat 2: " + chat2.var1 + ", " + chat2.var2 + ", " + chat2.var3);
        System.out.println("Chat 3: " + chat3.var1 + ", " + chat3.var2 + ", " + chat3.var3);
        System.out.println("Chat 4: " + chat4.var1 + ", " + chat4.var2 + ", " + chat4.var3);
        System.out.println("Chat 5: " + chat5.var1 + ", " + chat5.var2 + ", " + chat5.var3);
        System.out.println("-----------------------------");

        Charger charger1 = new Charger("Type-C", "Micro-USB", "Lightning");
        Charger charger2 = new Charger("Wireless", "Fast Charger", "Solar Charger");
        Charger charger3 = new Charger("Car Charger", "Portable Charger", "USB-C");
        Charger charger4 = new Charger("Qi Charger", "MagSafe", "Inductive Charger");
        Charger charger5 = new Charger("Multi-Port Charger", "GaN Charger", "Power Bank");

        System.out.println("Charger 1: " + charger1.var1 + ", " + charger1.var2 + ", " + charger1.var3);
        System.out.println("Charger 2: " + charger2.var1 + ", " + charger2.var2 + ", " + charger2.var3);
        System.out.println("Charger 3: " + charger3.var1 + ", " + charger3.var2 + ", " + charger3.var3);
        System.out.println("Charger 4: " + charger4.var1 + ", " + charger4.var2 + ", " + charger4.var3);
        System.out.println("Charger 5: " + charger5.var1 + ", " + charger5.var2 + ", " + charger5.var3);
        System.out.println("-----------------------------");

        Harpic harpic1 = new Harpic("Lemon", "Mint", "Orange");
        Harpic harpic2 = new Harpic("Pineapple", "Rose", "Lavender");
        Harpic harpic3 = new Harpic("Blue", "Green", "Yellow");
        Harpic harpic4 = new Harpic("Power Clean", "Ultra Clean", "Germ Shield");
        Harpic harpic5 = new Harpic("Fresh", "Ocean Breeze", "Spring Blossom");

        System.out.println("Harpic 1: " + harpic1.var1 + ", " + harpic1.var2 + ", " + harpic1.var3);
        System.out.println("Harpic 2: " + harpic2.var1 + ", " + harpic2.var2 + ", " + harpic2.var3);
        System.out.println("Harpic 3: " + harpic3.var1 + ", " + harpic3.var2 + ", " + harpic3.var3);
        System.out.println("Harpic 4: " + harpic4.var1 + ", " + harpic4.var2 + ", " + harpic4.var3);
        System.out.println("Harpic 5: " + harpic5.var1 + ", " + harpic5.var2 + ", " + harpic5.var3);
        System.out.println("-----------------------------");
		
        WhatsApp whatsApp1 = new WhatsApp("Chat", "Status", "Calls");
        WhatsApp whatsApp2 = new WhatsApp("Groups", "Broadcast", "Payments");
        WhatsApp whatsApp3 = new WhatsApp("Web", "Business", "Stickers");
        WhatsApp whatsApp4 = new WhatsApp("Voice Notes", "Video Calls", "End-to-End Encryption");
        WhatsApp whatsApp5 = new WhatsApp("Dark Mode", "Archived Chats", "WhatsApp Web");

        System.out.println("WhatsApp 1: " + whatsApp1.var1 + ", " + whatsApp1.var2 + ", " + whatsApp1.var3);
        System.out.println("WhatsApp 2: " + whatsApp2.var1 + ", " + whatsApp2.var2 + ", " + whatsApp2.var3);
        System.out.println("WhatsApp 3: " + whatsApp3.var1 + ", " + whatsApp3.var2 + ", " + whatsApp3.var3);
        System.out.println("WhatsApp 4: " + whatsApp4.var1 + ", " + whatsApp4.var2 + ", " + whatsApp4.var3);
        System.out.println("WhatsApp 5: " + whatsApp5.var1 + ", " + whatsApp5.var2 + ", " + whatsApp5.var3);
        System.out.println("-----------------------------");

        RatPoison ratPoison1 = new RatPoison("Bromadiolone", "Warfarin", "Difenacoum");
        RatPoison ratPoison2 = new RatPoison("Brodifacoum", "Cholecalciferol", "Zinc Phosphide");
        RatPoison ratPoison3 = new RatPoison("Strychnine", "Coumachlor", "Flocoumafen");
        RatPoison ratPoison4 = new RatPoison("Pindone", "Diphacinone", "Chlorophacinone");
        RatPoison ratPoison5 = new RatPoison("Bromethalin", "Calciferol", "Scilliroside");

        System.out.println("RatPoison 1: " + ratPoison1.var1 + ", " + ratPoison1.var2 + ", " + ratPoison1.var3);
        System.out.println("RatPoison 2: " + ratPoison2.var1 + ", " + ratPoison2.var2 + ", " + ratPoison2.var3);
        System.out.println("RatPoison 3: " + ratPoison3.var1 + ", " + ratPoison3.var2 + ", " + ratPoison3.var3);
        System.out.println("RatPoison 4: " + ratPoison4.var1 + ", " + ratPoison4.var2 + ", " + ratPoison4.var3);
        System.out.println("RatPoison 5: " + ratPoison5.var1 + ", " + ratPoison5.var2 + ", " + ratPoison5.var3);
        System.out.println("-----------------------------");

        Anklet anklet1 = new Anklet("Gold", "Silver", "Diamond");
        Anklet anklet2 = new Anklet("Platinum", "Pearl", "Ruby");
        Anklet anklet3 = new Anklet("Sapphire", "Emerald", "Topaz");
        Anklet anklet4 = new Anklet("Rose Gold", "Oxidized", "Beaded");
        Anklet anklet5 = new Anklet("Charm", "Bangle", "Chain");

        System.out.println("Anklet 1: " + anklet1.var1 + ", " + anklet1.var2 + ", " + anklet1.var3);
        System.out.println("Anklet 2: " + anklet2.var1 + ", " + anklet2.var2 + ", " + anklet2.var3);
        System.out.println("Anklet 3: " + anklet3.var1 + ", " + anklet3.var2 + ", " + anklet3.var3);
        System.out.println("Anklet 4: " + anklet4.var1 + ", " + anklet4.var2 + ", " + anklet4.var3);
        System.out.println("Anklet 5: " + anklet5.var1 + ", " + anklet5.var2 + ", " + anklet5.var3);
        System.out.println("-----------------------------");

        Magnet magnet1 = new Magnet("Neodymium", "Ferrite", "Alnico");
        Magnet magnet2 = new Magnet("Samarium Cobalt", "Flexible", "Rare Earth");
        Magnet magnet3 = new Magnet("Ceramic", "Plastic", "Rubber");
        Magnet magnet4 = new Magnet("Electromagnet", "Temporary", "Permanent");
        Magnet magnet5 = new Magnet("Bar Magnet", "Horseshoe Magnet", "Ring Magnet");

        System.out.println("Magnet 1: " + magnet1.var1 + ", " + magnet1.var2 + ", " + magnet1.var3);
        System.out.println("Magnet 2: " + magnet2.var1 + ", " + magnet2.var2 + ", " + magnet2.var3);
        System.out.println("Magnet 3: " + magnet3.var1 + ", " + magnet3.var2 + ", " + magnet3.var3);
        System.out.println("Magnet 4: " + magnet4.var1 + ", " + magnet4.var2 + ", " + magnet4.var3);
        System.out.println("Magnet 5: " + magnet5.var1 + ", " + magnet5.var2 + ", " + magnet5.var3);
        System.out.println("-----------------------------");

        Chain chain1 = new Chain("Gold Chain", "Silver Chain", "Platinum Chain");
        Chain chain2 = new Chain("Rope Chain", "Cuban Link", "Figaro Chain");
        Chain chain3 = new Chain("Bead Chain", "Box Chain", "Snake Chain");
        Chain chain4 = new Chain("Anchor Chain", "Ball Chain", "Cable Chain");
        Chain chain5 = new Chain("Diamond Chain", "Pearl Chain", "Leather Chain");

        System.out.println("Chain 1: " + chain1.var1 + ", " + chain1.var2 + ", " + chain1.var3);
        System.out.println("Chain 2: " + chain2.var1 + ", " + chain2.var2 + ", " + chain2.var3);
        System.out.println("Chain 3: " + chain3.var1 + ", " + chain3.var2 + ", " + chain3.var3);
        System.out.println("Chain 4: " + chain4.var1 + ", " + chain4.var2 + ", " + chain4.var3);
        System.out.println("Chain 5: " + chain5.var1 + ", " + chain5.var2 + ", " + chain5.var3);
        System.out.println("-----------------------------");

        Bar bar1 = new Bar("Gold Bar", "Silver Bar", "Platinum Bar");
        Bar bar2 = new Bar("Copper Bar", "Bronze Bar", "Steel Bar");
        Bar bar3 = new Bar("Iron Bar", "Aluminum Bar", "Titanium Bar");
        Bar bar4 = new Bar("Zinc Bar", "Nickel Bar", "Lead Bar");
        Bar bar5 = new Bar("Brass Bar", "Tin Bar", "Magnesium Bar");

        System.out.println("Bar 1: " + bar1.var1 + ", " + bar1.var2 + ", " + bar1.var3);
        System.out.println("Bar 2: " + bar2.var1 + ", " + bar2.var2 + ", " + bar2.var3);
        System.out.println("Bar 3: " + bar3.var1 + ", " + bar3.var2 + ", " + bar3.var3);
        System.out.println("Bar 4: " + bar4.var1 + ", " + bar4.var2 + ", " + bar4.var3);
        System.out.println("Bar 5: " + bar5.var1 + ", " + bar5.var2 + ", " + bar5.var3);
        System.out.println("-----------------------------");

        Sagar sagar1 = new Sagar("Sagar1_Var1", "Sagar1_Var2", "Sagar1_Var3");
        Sagar sagar2 = new Sagar("Sagar2_Var1", "Sagar2_Var2", "Sagar2_Var3");
        Sagar sagar3 = new Sagar("Sagar3_Var1", "Sagar3_Var2", "Sagar3_Var3");
        Sagar sagar4 = new Sagar("Sagar4_Var1", "Sagar4_Var2", "Sagar4_Var3");
        Sagar sagar5 = new Sagar("Sagar5_Var1", "Sagar5_Var2", "Sagar5_Var3");

        System.out.println("Sagar 1: " + sagar1.var1 + ", " + sagar1.var2 + ", " + sagar1.var3);
        System.out.println("Sagar 2: " + sagar2.var1 + ", " + sagar2.var2 + ", " + sagar2.var3);
        System.out.println("Sagar 3: " + sagar3.var1 + ", " + sagar3.var2 + ", " + sagar3.var3);
        System.out.println("Sagar 4: " + sagar4.var1 + ", " + sagar4.var2 + ", " + sagar4.var3);
        System.out.println("Sagar 5: " + sagar5.var1 + ", " + sagar5.var2 + ", " + sagar5.var3);
        System.out.println("-----------------------------");

        Face face1 = new Face("Eyes", "Nose", "Mouth");
        Face face2 = new Face("Ears", "Cheeks", "Forehead");
        Face face3 = new Face("Chin", "Lips", "Eyebrows");
        Face face4 = new Face("Jawline", "Temples", "Philtrum");
        Face face5 = new Face("Dimples", "Nostrils", "Eyelashes");

        System.out.println("Face 1: " + face1.var1 + ", " + face1.var2 + ", " + face1.var3);
        System.out.println("Face 2: " + face2.var1 + ", " + face2.var2 + ", " + face2.var3);
        System.out.println("Face 3: " + face3.var1 + ", " + face3.var2 + ", " + face3.var3);
        System.out.println("Face 4: " + face4.var1 + ", " + face4.var2 + ", " + face4.var3);
        System.out.println("Face 5: " + face5.var1 + ", " + face5.var2 + ", " + face5.var3);
        System.out.println("-----------------------------");
    }
}
