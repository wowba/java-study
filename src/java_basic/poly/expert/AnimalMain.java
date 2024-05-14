package java_basic.poly.expert;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        // 부모는 자식을 담을 수 있기 때문에 아래처럼 사용 가능
        // 다형성 덕분에 새로운 동물이 추가되어도 아래 메서드를 사용할 수 있다.
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        // 배열로 중복을 줄일 수 있다.
        Animal[] originalAnimals = new Animal[]{dog, cat, caw}; // 원본
        Animal[] inlineAnimal = {new Dog(), new Cat(), new Caw()}; // 선언과 축약
        Animal[] animals = {dog, cat, caw}; // 축약

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 각 자식 클래스가 오버라이드 한
        // 메서드를 사용
        animal.move(); // 추상 클래스에서 선언된 일반 메서드
        System.out.println("동물 소리 테스트 종료");
    }
}
