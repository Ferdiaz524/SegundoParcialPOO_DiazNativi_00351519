import java.util.ArrayList;

public class DepaPrincipal implements Component{
    private Component children;
    Component empleadoPrincipal;

    public void add (Component children){
        this.children = children;
    }

    public Component getChildren(){
        return children;
    }
    public Component getEmpleado(){
        return empleadoPrincipal;
    }

    @Override
    public void execute() {
        System.out.println("Delegate all work to employees and deparments\n");
    }
}
