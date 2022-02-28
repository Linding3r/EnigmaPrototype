package com.company;

public class Main {
    char[] alphabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

    public char convertNumberToLetter(int position){
        char letter = alphabet[position];
        return letter;
    }

    public int convertLetterToNumber(char letter){
        int position = 0;
        for(int x = 0; x < alphabet.length; x++){
            if(letter == alphabet[x]){
                position = x;
            }
        }return position;
    }

    public void test(char number, int letter){
        System.out.println(convertLetterToNumber(number));
        System.out.println(convertNumberToLetter(letter));
    }

    public static void main(String[] args) {
    Main prg = new Main();
        prg.test('T', 22);
    }
}
