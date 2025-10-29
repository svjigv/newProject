public class Car implements IProduct {
    private IProductPart engine;
    private IProductPart body;
    private IProductPart chassis;

    @Override
    public void installFirstPart(IProductPart part) {
        this.engine = part;
        System.out.println("Установлена деталь " + part);
    }

    @Override
    public void installSecondPart(IProductPart part) {
        this.body = part;
        System.out.println("Установлена деталь " + part);
    }

    @Override
    public void installThirdPart(IProductPart part) {
        this.chassis = part;
        System.out.println("Установлена деталь " + part);
    }
}
