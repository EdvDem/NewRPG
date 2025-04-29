public class ChapterOne {
    public static void startChapter() {
        int choice = App.interaction("\"You seem confused...\"", "\"Where are we?\"", "Run away");
        if (choice == 1) {
            sceneOne();
        } else if (choice == 2) {
            System.out.println("You run off into the distance, leaving Ada behind.");
            App.separationLine();
            ChapterTwo.optionTwo();
        }

        App.separationLine();
        sceneTwo();
        ChapterTwo.optionTwo();
        App.separationLine();
    }

    public static void sceneOne() {
        System.out.println("Ada:");
        System.out.println("\"This is the Nexus, a realm where code and magic intertwine.\"");
        int choice = App.interaction("\"You are a Code Weaver, a rare being who can manipulate the very fabric of this world.\"", 
                                   "\"How do I get back home?\"", 
                                   "\"Manipulate the fabric of this world?\"");

        if (choice == 1) {
            System.out.println("Ada:");
            System.out.println("\"You must learn to harness your powers. Only then can you return to your world using your abilities.\"");
            App.emptyLine();
            System.out.println(App.getCurrentPlayerName() + ":");
            System.out.println("\"But how? I don't even really understand what you mean by this power...\"");
            System.out.println("\"Manipulating the fabric of the world sounds rather like magic.\"");
        }

        App.emptyLine();
        System.out.println("Ada:");
        System.out.println("\"You can bend the code of this world to your will through witchcraft. But it requires training and focus.\"");
        System.out.println("\"You can alter the properties of objects or even your opponents to weaken them.\"");
        System.out.println("\"To begin, you must learn to read the Code Glyphs scattered throughout this realm. They hold the secrets to unlocking your potential.\"");
        App.emptyLine();
        System.out.println(App.getCurrentPlayerName() + ":");
        System.out.println("\"Guess I have no other choice. Where can we find these Code Glyphs?\"");
        App.emptyLine();
        System.out.println("Ada:");
        System.out.println("\"There are many hidden throughout the Nexus. Some are guarded by powerful beings, while others are in plain sight.\"");
        System.out.println("\"I can help you find them, but you must be careful. The Nexus is not a safe place for the untrained.\"");
        App.emptyLine();
        System.out.println(App.getCurrentPlayerName() + ":");
        System.out.println("\"Let's get going then!\"");
    }

    public static void sceneTwo() {
        System.out.println("Ada:");
        System.out.println("\"Follow me, and I'll show you the way.\"");
        App.emptyLine();
        System.out.println("As you walk with Ada, you notice the environment around you shifting. The air crackles with energy, and the ground beneath your feet seems to pulse with a rhythm of its own.");
        System.out.println("Suddenly, a shadowy figure appears in front of you, blocking your path.");
        App.emptyLine();
        System.out.println("Ada:");
        System.out.println("\"Stay back! This is a Guardian of the Nexus.\"");
        System.out.println("Ada raises her hand, and a glowing glyph appears in the air before her. The glyph pulses with energy as she begins to chant in a language you don't understand.");
        System.out.println("The Guardian roars and charges toward Ada, but she remains calm and focused. The glyph expands, forming a barrier of light that stops the Guardian in its tracks.");
        App.emptyLine();
        System.out.println("Ada:");
        System.out.println("\"This won't hold it for long. I need to weaken it!\"");
        App.emptyLine();
        System.out.println("Ada gestures again, and the glyph transforms into a series of glowing threads that wrap around the Guardian. The creature struggles, but the threads tighten, sapping its strength.");
        App.emptyLine();
        System.out.println("Ada:");
        System.out.println("\"Now, listen carefully! I will teach you a basic glyph. Focus on my words and replicate the pattern in your mind.\"");
        App.emptyLine();
        System.out.println("Ada begins to trace a glowing symbol in the air, explaining its structure and purpose. You watch intently, trying to memorize every detail.");
        App.emptyLine();
        System.out.println("Ada:");
        System.out.println("\"This is the Glyph of Binding. It will allow you to strike the Guardian while it's weakened. Now, concentrate and project it toward the creature!\"");
        App.emptyLine();
        System.out.println("You close your eyes and focus on the glyph Ada taught you. Slowly, you trace the symbol in the air, feeling a surge of energy as it takes form.");
        App.emptyLine();
        System.out.println("The glyph glows brightly and shoots toward the Guardian, striking it with a burst of energy. The creature lets out a final roar before collapsing to the ground, defeated.");
        App.emptyLine();
        System.out.println("Ada:");
        System.out.println("\"Well done. You've taken your first step as a Code Weaver. But this is only the beginning. Let's keep moving before more Guardians appear.\"");
    }
}