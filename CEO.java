public class CEO implements Component{
    private Component children;
    Component empleado;

    public void add (Component children){
        this.children = children;
    }

    public Component getChildren(){
        return children;
    }
    public Component getEmpleado(){
        return empleado;
    }

    @Override
    public void execute() {
        System.out.println("Delegate all work to employees and deparments\n");
    }
}
