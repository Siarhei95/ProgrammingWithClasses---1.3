//Создайте класс  с именем Student, содержащий  поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий
// номеров групп студентов, имеющих оценки, равные только 9 или 10.

package Task3;

    public class Students {
        private String name;
        private String surname;
        private String middleName;
        private int numberGroup;
        private int[] progress = new int[5];

        private Students(String surname, int numberGroup, int[] progress) {
            this.surname = surname;
            this.numberGroup = numberGroup;
            this.progress = progress;
        }

        private static void searchBest(Students[] list) {
            for (Students student : list) {
                int count = 0;
                for (int n : student.progress) {
                    if (n < 9) {
                        count++;
                    }
                }
                if (count == 0)
                    System.out.println("The best students: " + student.surname + ", group - " + student.numberGroup);
            }
        }

        public static void main(String[] args) {
            Students [] list = {
                    new Students("Zelenskiy", 3, new int[]{3, 8, 2, 3, 9}),
                    new Students("Lukashenko", 1, new int[]{9, 10, 9, 9, 9}),
                    new Students("Pytin", 1, new int[]{9, 10, 9, 9, 10}),
                    new Students("Trump", 2, new int[]{5, 10, 7, 6, 9}),
                    new Students("Merkel", 4, new int[]{9, 10, 9, 9, 9}),
                    new Students("Kim", 5, new int[]{8, 6, 7, 7, 10}),
                    new Students("Makron", 6, new int[]{2, 5, 9, 8, 9}),
                    new Students("Duda", 6, new int[]{2, 6, 9, 8, 9}),
                    new Students("Elizaveta II", 3, new int[]{3, 6, 9, 8, 9}),
                    new Students("Obama", 8, new int[]{2, 5, 9, 8, 9})};
            searchBest(list);

            String[] name =
                    new String[]{"Vladimir", "Alexandr", "Vladimir", "Donald", "Angela", "Chen In", "Emmanuel", "Andrey","Elizaveta II", "Barak"};

            }
        }



