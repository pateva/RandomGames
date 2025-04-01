package org.example.utils;

public enum HangmanState {

    STAGE0(0) {
        @Override
        public void draw() {
            System.out.println("Welcome to Hangman!");
            System.out.println("You have 7 tries to guess the word.");
        }

        @Override
        public HangmanState next() {
            return STAGE1;
        }

    },
    STAGE1(1) {
        @Override
        public void draw() {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }

        @Override
        public HangmanState next() {
            return STAGE2;
        }
    },
    STAGE2(2) {
        @Override
        public void draw() {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }

        @Override
        public HangmanState next() {
            return STAGE3;
        }
    },
    STAGE3(3) {
        @Override
        public void draw() {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }

        @Override
        public HangmanState next() {
            return STAGE4;
        }
    },
    STAGE4(4) {
        @Override
        public void draw() {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }

        @Override
        public HangmanState next() {
            return STAGE5;
        }
    },
    STAGE5(5) {
        @Override
        public void draw() {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }

        @Override
        public HangmanState next() {
            return STAGE6;
        }
    },
    STAGE6(6) {
        @Override
        public void draw() {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }

        @Override
        public HangmanState next() {
            return STAGE7;
        }
    },
    STAGE7(7) {
        @Override
        public void draw() {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }

        @Override
        public HangmanState next() {
            // Final state; remains the same.
            return this;
        }
    };

    public final int stage;

    HangmanState(int stage) {
        this.stage = stage;
    }

    public int getStage() {
        return stage;
    }

    public abstract void draw();

    public abstract HangmanState next();
}

