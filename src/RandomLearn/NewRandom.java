package RandomLearn;

import java.util.*;
public class NewRandom extends Random{
    //1st method // overloads Random's nextInt() to return a random number between low and high, both inclusive. [low, high]
    public int nextInt(int low, int high) {
        int n = nextInt(high - low + 1) + low;
        return n;
    }
    //2nd method // returns an even random number between low and high, both inclusive.
    public int nextEven(int low, int high) {
        int n = 0;

        boolean even = false;
        while (!even) {
            n = nextInt(low, high);
            {
                even = true;
            }
        }
        return n;
    }
    //3rd method // returns an odd random number between low and high, both inclusive. [low, high]
    public int nextOdd(int low, int high) {

        int n = 0;

        boolean odd = false;
        while(!odd) {
            n = nextInt(low, high);
            {
                odd = true;
            }
        }
        return n;
    }
    //4th method // returns a random upper case "capital" character
    public char nextChar() {
        int n = nextInt('A', 'Z');
        return (char) n;
    }

    //5th method // returns a random upper case "capital" character
    public char nextChar(char from, char to) {
        if(from < to) {
            int n = nextInt(from, to);
            return (char) n;
        }
        else if (from > to) {
            int n = nextInt(from, to);
            return (char) n;
        }
        else {
            int n = nextInt(from, to);
            return (char) n;
        }
    }
    public char nextChar(char c, int i) {//6th method

        if(c < i) {
            int n = nextInt(c, i);
            return (char) n;
        }
        else if (c > i) {
            int n = nextInt(c, i);
            return (char) n;
        }
        else {
            int n = nextInt(c, i);
            return (char) n;

        }
    }
    // returns a random special character.
    public char nextSpecialChar() {//7th method
        int low = 33;
        int high = 126;
        char c = ' ';
        boolean special = false;
        while (!special) {
            int n = nextInt(low, high);
            c = (char) n;
            {
                special = true;
            }
        }
        return (char)c;
    }
}

