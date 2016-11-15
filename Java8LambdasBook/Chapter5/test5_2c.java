import java.util.stream.*;
import java.util.function.*;
import java.util.*;

class GroupingByCollector<T, K>  implements Collector<T, Map<K, List<T>>, Map<K, List<T>>> {

	Function<? super T, ? extends K> classifier;
	
	public GroupingByCollector(Function<? super T, ? extends K> classifier) {
		this.classifier = classifier;
	}

	@Override
	public Supplier<Map<K, List<T>>> supplier() {
		return () -> new HashMap<K, List<T>>();
	}

	@Override
	public BiConsumer<Map<K, List<T>>, T> accumulator() {
		return (acc, it) -> {
				K key = classifier.apply(it);
				consume(acc, key, it);
			};
	}

	@Override
	public BinaryOperator<Map<K, List<T>>> combiner() {
		return (first, second) -> {
			Map<K, List<T>> resultMap = new HashMap<>();

			first.keySet().stream()
				.forEach(key -> resultMap.merge(key, first.get(key), this::remapLists) );
			second.keySet().stream()
				.forEach(key -> resultMap.merge(key, second.get(key), this::remapLists) );
			return resultMap;
		};
	}

	@Override
	public Function<Map<K, List<T>>, Map<K, List<T>>> finisher() {
		return (acc) -> acc;
	}

	@Override
	public Set<Collector.Characteristics> characteristics() {
		return EnumSet.of(Collector.Characteristics.UNORDERED);
	}
						
	
	public void consume(Map<K, List<T>> acc, K key, T it) {
		if(acc.containsKey(key))
			acc.get(key).add(it);
		else {
			List<T> list = new ArrayList<>();
			list.add(it);
			acc.put(key, list);
		}
	}

	public List<T> remapLists(List<T> first, List<T> second) {
		first.addAll(second);
		return first;
	}
}

public class test5_2c {
	public static void main(String... args) { 
		List<String> list = Arrays.asList("First", "Second", "Third", "Fifth", "Sixth", "Seventh");

		Map<Integer, List<String>> map = list.stream()
			.collect(new GroupingByCollector<String, Integer>( it -> it.length() ) );

		System.out.println( map );
	}
}
