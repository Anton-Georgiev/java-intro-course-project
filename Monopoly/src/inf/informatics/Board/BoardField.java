package inf.informatics.Board;

import inf.informatics.Trappers.Trap;

    public class BoardField {
        String type;
        Trap trap;

        public Trap getTrap() {
            return trap;
        }

        public void setTrap(Trap trap) {
            this.trap = trap;
        }

        public BoardField(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
