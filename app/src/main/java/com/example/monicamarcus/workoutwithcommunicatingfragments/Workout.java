package com.example.monicamarcus.workoutwithcommunicatingfragments;

/**
 * Created by monicamarcus on 1/30/16.
 */
public class Workout {
        private String name;
        private String description;

        public static final Workout[] workouts = {
                new Workout("The limb loosener",
                        "5 Handstand push-ups\n10 1-leg squats\n15 Pull-ups"),
                new Workout("Core Agony",
                        "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100Squats"),
                new Workout("The Wimp special",
                        "5 Pull-ups\n10 Push-ups\n15 squats"),
                new Workout("Strength and Length",
                        "500 meter run\n21x1.5 pood kettkeball swing\n21 X pull-ups")
        };

        private Workout(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return this.name;
        }
        public String getDescription() {
            return this.description;
        }
        public String toString() {
            return this.name;
        }

    }
