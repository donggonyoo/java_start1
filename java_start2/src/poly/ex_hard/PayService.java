package poly.ex_hard;

public class PayService {
	public void processPay(String option, int amount) {
		boolean result;
		System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
				amount);

		Pay pay = PayStore.findPay(option);
		result = pay.pay(amount);
		if(result) {
			System.out.println("결제에 성공했어요");
		}
		else {
			System.out.println("결제 실패");
		}
		
		
	}
}

