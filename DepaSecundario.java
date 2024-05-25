public class DepaSecundario implements Component{
    private Component children;
    Component empleadoSecundario;

    public void add (Component children){
        this.children = children;
    }

    public Component getChildren(){
        return children;
    }
    public Component getEmpleado(){
        return empleadoSecundario;
    }

    @Override
    public void execute() {
        System.out.println("Delegate all work to employees and deparments\n");
    }
}
