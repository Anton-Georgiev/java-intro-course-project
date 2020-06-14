package inf.informatics.Steal;

import inf.informatics.Board.BoardField;

public class ConquerTheWorld extends Steal {
    @Override
    public String getDescription() { return
                "Стереотипно, но изпитано.\n" +
                "Завладяването на света е любим план на\n" +
                "всички зли гении. Ще започнем с леки\n" +
                "сътресения на икономиката и ще видим\n" +
                "до къде ще стигне работата.";
    }

    @Override
    public double getPrice(BoardField field) {
        if (field.getType()=="C"){
            return 100;
        }
        return 0;
    }
}
