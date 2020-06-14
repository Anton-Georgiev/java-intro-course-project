package inf.informatics.Trappers;

    public class setTrap {
        public Trap genTrap(int trapNumber){
            if (trapNumber == 1){
                return new TaxAudit();
            } else if (trapNumber == 2){
                return new CatDivorce();
            } else if (trapNumber == 3){
                return new Propaganda();
            } else if (trapNumber == 4){
                return new Vision();
            } else if (trapNumber == 5){
                return new GamblingBoss();
            } else {
                return null;
            }
        }

        public void getTrapOptions(){
            String str = "Желаете ли да заложите капан?\n" +
                    "* (1) : Данъчна ревизия (100 шп)\n" +
                    "* (2) : Развод по котешки (200 шп)\n" +
                    "* (3) : Пропаганда (100 шп)\n" +
                    "* (4) : Проглеждане (50 шп)\n" +
                    "* (5) : Хазартен бос (100 шп)\n" +
                    "* (N) : Не, благодаря, не вярвам в злото";
            System.out.print(str);
        }
    }

