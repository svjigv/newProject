public class EngineStep implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Изготавливаем двигатель");
        return new Engine();
    }
}
