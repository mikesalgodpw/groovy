package com.mike.classGetter
import com.mike.guice.Dog

class ClassGetterMain {

    static int maxi(int a, int b){
        //def c= a>b? a: b

        /*if (a>b)
            return a
        else return b*/

        //return c

        a>b? a: b
    }

    static void main(String[] args) {

        def person1 = new Person()
        person1.name='Mike'
        person1.setAge(36)

        println person1.name
        println person1.getAge()

        /*
        def dog1 = new Dog()
        //dog1.getSound();
        println dog1.getSound();
        */


        //testing declare variable without using variable type
        def str1='This is str1'
        String str2='This is str2'

        println str1
        println str2

        //if then else single line
        println maxi(3,8)
        println maxi(9,4)
    }
}
