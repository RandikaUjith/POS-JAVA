public class Action{
    
    PosGUI gui = new PosGUI();

    public Action(){
        final String responce = gui.returnAction();
        System.out.println(responce);
    }
    
}
