package test;

public class Calculators<T> {

	public T sum(int a, int b) {

		@SuppressWarnings("rawtypes")
		CallbackCalcu callback = new CallbackCalcu<Integer>() {

			@Override
			public Integer doInSum(Integer ae, Integer be) {
				return ae + be;
			}


		};


		return (T) callback.doInSum(a, b);


	}


}
