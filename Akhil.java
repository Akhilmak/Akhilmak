public class Akhil {
    public static void main(String[] args) {
        // Pronouns: Because labels are cool, but we all know I'm a coding wizard
        String[] pronouns = {"He", "Him"};

        // Education: The never-ending journey of "Oh, I'll figure it out someday!"
        String education = "Final Year Student at Centurion University of Technology and Management";

        // Coding Languages: I know a little bit of everything, but still can't fix my car
        String[] codingLanguages = {"Java", "JavaScript", "Python", "C", "PHP", "Shell scripting"};

        // Front-End: Making websites look fancy, because who cares about back-end anyway?
        String[] frontEnd = {"React", "Tailwind", "HTML", "CSS"};

        // Back-End: Where all the secrets are hidden (also known as ‘The Black Hole’)
        String[] backEnd = {"SpringBoot", "Java", "PHP"};

        // Databases: Like a black hole for data... it gets lost, but at least it's safe
        String[] database = {"MySQL", "Postgres", "MongoDB", "Firebase", "Redis"};

        // Other: Git, Docker, and VSCode, because every dev is a rockstar with those tools
        String[] other = {"Git", "GitHub", "Markdown", "Docker", "GraphQL", "VSCode", "Android Studio"};

        // Testing Frameworks: "Do I need tests?" Me: "Nah, it works on my machine."
        String[] testingFrameworks = {"JUnit", "Surefire"};

        // Automation: Because who doesn't love a robot doing all the work?
        String[] automation = {"Selenium"};

        // Working: Or pretending to work, while really just checking social media
        boolean working = true;

        // Starting the world's most efficient workday (sarcasm level 100)
        while (working) {
            try {
                // Listening to music... because that's what gets the creative coding juices flowing
                listenMusic(true); // If this throws an error, it's probably because the Wi-Fi hates me
            } catch (Exception sleep) {
                throw new RuntimeException("Error occurred while trying to listen to music: Music is life!");
            }

            // Taking a break every 5 seconds... because life’s too short to work non-stop
            try {
                Thread.sleep(5000); // Because we all know working more than 5 minutes is overrated
                System.out.println("Finished working for now... or at least pretending to.");
                working = false;  // Stopping because my coffee is cold and I need a nap
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Final thoughts after completing an incredibly productive 5 minutes of work
        System.out.println("Code finished. Time to reward myself with a snack (or two, or three)...");
    }

    // Pretending to listen to music, but secretly just waiting for my computer to update
    public static void listenMusic(boolean isListening) throws Exception {
        if (isListening) {
            System.out.println("Listening to music... or pretending to work while secretly thinking about lunch.");
        } else {
            throw new Exception("Can't work without music. It’s the law of productivity!");
        }
    }
}
