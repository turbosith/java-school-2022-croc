package ru.croc.task6.some_package;

public class AnnotatedImage {

    private final String imagePath;

    private final Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation... annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;

    }

    public String getImagePath() {
        return this.imagePath;
    }

    public Annotation[] getAnnotations() {
        return this.annotations;
    }

    public Annotation findByPoint(int x, int y) {//поиск по координате
        for (int i = 0; i < annotations.length; i++) {
            if (annotations[i].getFigure().FindPoint(x, y) == true) {
                return annotations[i];
            }
        }
        return null;
    }

    public Annotation findByLabel(String label) {//поиск по подписи
        for (int i = 0; i < annotations.length; i++) {
            if (annotations[i].getName().contains(label) == true) {
                return annotations[i];
            }
        }
        return null;
    }


}

