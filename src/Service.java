public class Service {
    private Model model;
    public Service(Model m) {
        this.model = m;
    }
    public Double addition(){
        return model.getNb1() + model.getNb2();
    }
    public Double substraction(){
        return model.getNb1() - model.getNb2();
    }
    public Double multiplication (){
        return model.getNb1() * model.getNb2();
    }
    public Double division(){
        if(model.getNb2() == 0){
            throw new RuntimeException("Division by 0 is not possible");
        }
        return model.getNb1() / model.getNb2();
    }

    public Double modolus(){
        if(model.getNb2() == 0){
            throw new RuntimeException("Division by 0 is not possible");
        }
        return model.getNb1() % model.getNb2();

    }
}
