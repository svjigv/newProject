public class ChassisStep implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Изготавливаем шасси");
        return new Chassis();
    }
}
