package inf.informatics.Steal;
import inf.informatics.Board.BoardField;

public abstract class Steal {
//    BoardField field;
//    public Steal(BoardField field) {
//        this.field = field;
//    }
    public abstract String getDescription();
    public abstract double getPrice(BoardField field);
    }
}
