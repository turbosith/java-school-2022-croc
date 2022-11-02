package ru.croc.task6;

import ru.croc.task6.some_package.Annotation;
import ru.croc.task6.some_package.Circle;
import ru.croc.task6.some_package.Rectangle;
import ru.croc.task6.some_package.AnnotatedImage;

public class Task6 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2, 2, 2);
        Rectangle rectangle = new Rectangle(3, 1, 1, 3);
        System.out.println(circle1.toString());
        Annotation annotations = new Annotation(circle1, "Turbo");
        System.out.println(annotations.toString());
        Annotation annotations1 = new Annotation(rectangle, "CROC");
        System.out.println(annotations1.toString());
        AnnotatedImage anIm = new AnnotatedImage("desctop/annotations", annotations, annotations1);
        System.out.println(anIm.findByPoint(3, 1));
        System.out.println(anIm.findByLabel("bo"));
    }
}
