// 1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
// 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.

class SummArray {
    public static void main (String[] args) {
        int resultSumm;
        String[][] matrix1 = {{"2","2","4","5"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        try {
            Array.checkArray(matrix1);
        } catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
        }

        try {
            resultSumm = Array.getSumm(matrix1);
            System.out.println(resultSumm);
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}


class MyArraySizeException extends Exception {
    private String[][] matrix;

    public MyArraySizeException(String message, String[][] matrix) {
        super(message);
        this.matrix = matrix;
    }

    public String[][] getMatrix() {
        return matrix;
    }

}

class MyArrayDataException extends Exception {
    private int i;
    private int j;

    public MyArrayDataException(String message, int i, int j) {
        super(message + " " + i + " " + j);
        this.i = i;
        this.j = j;
    }

}

class Array {
    public static void checkArray(String[][] matrix) throws MyArraySizeException {
        if (matrix.length !=4) {throw new MyArraySizeException("Необходимо задать двумерный массив 4х4", matrix);}
    }

    public static int getSumm(String[][] matrix) throws MyArrayDataException {
        int result = 0;
        boolean numFormatExc = false;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                try {
                    Integer.parseInt(matrix[i][j]);
                    numFormatExc = false;
                } catch (NumberFormatException e) {
                    numFormatExc = true;
                }

                if (numFormatExc) {throw new MyArrayDataException("Задан неверный символ в ячейке", i, j);}
                result += Integer.parseInt(matrix[i][j]);
            }
        }
        return result;
    }
}