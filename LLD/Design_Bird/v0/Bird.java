package v0;


import java.util.*;


class Bird
{
    String birdName;
    String color;
    int weight;
    int height;

    Bird(String birdName)
    {
        this.birdName=birdName;
    }


    void fly()
    {
        if(birdName=="sparrow")
        {
            System.out.println("sparrow is flying");
        }
        else if(birdName=="peacock")
        {
            System.out.println("peacock is flying");
        }
        else if(birdName=="pigeon")
        {
            System.out.println("pigeon is flying");
        }
    }

    void makeSound()
    {
        if(birdName=="sparrow")
        {
            System.out.println("sparrow is making sound");
        }
        else if(birdName=="peacock")
        {
            System.out.println("peacock is making sound");
        }
        else if(birdName=="pigeon")
        {
            System.out.println("pigeon is making sound");
        }
    }
}