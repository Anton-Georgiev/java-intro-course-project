package inf.informatics.Steal;

import inf.informatics.Board.BoardField;

public class Hostages extends Steal {
    @Override
    public String getDescription() {
        return "Отвличането на кралското семейство не е\n" +
                "опция, но можем да отвлечем друг важен\n" +
                "персонаж. Ще ни плащат всеки месец и\n" +
                "ще си живеем добре.";
    }

    @Override
    public double getPrice(BoardField field) {
        if(field.getType() == "I"){
            return 100;
        }
        return 0;
    }
}
