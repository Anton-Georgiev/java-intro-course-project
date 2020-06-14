package inf.informatics.Steal;

import inf.informatics.Board.BoardField;

public class BankRobbery extends Steal {
    @Override
    public String getDescription() {
        return "Шоколадовата банка е празна, но има и\n" +
                "други институции, които раздават\n" +
                "безплатни пари. Да се захващаме за\n" +
                "работа.";
    }

    @Override
    public double getPrice(BoardField field) {
        if (field.getType() == "S") {
            return 100;
        }
        return 0;
    }
}
