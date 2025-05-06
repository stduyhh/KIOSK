package repeat;

public class Cafe {
    //속성
    int amount;
    String coffe;
    String juice;
    String cake;
        //생성자
        public Cafe() {

        }

        public Cafe(int amount, String coffe, String juice, String cake) {
               this.amount = amount;
               this.coffe = coffe;
               this.juice = juice;
               this.cake = cake;
           }
    //기능
    public String order(String x){
             this.coffe=x;
            return "주문하신 커피는 " + coffe + "입니다.";
    }

    String search(int a){
        return "조회하신 금액은 " + a + "원 입니다.";
    }

    String juce(String a){
            return a + "를 시켰어요";
    }

    String cakee(String z){
            return z + "는 맛있어요";
    }

    String setName(String xxxx){
          return  this.coffe = xxxx;
    }

    String getCoffe(){
            return this.coffe=coffe;
    }
}
