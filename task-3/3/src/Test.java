public class Test {
    public static void main(String[] args) {
        ILineStep engineStep = new EngineStep();
        ILineStep chassisStep = new ChassisStep();
        ILineStep bodyStep = new BodyStep();
        IAssemblyLine assemblyLine = new AssemblyLine(engineStep, chassisStep, bodyStep);
        IProduct car = new Car();
        assemblyLine.assembleProduct(car);
    }
}
