public class BodyStep implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Изготавливаем кузов");
        return new Body();
    }
}
