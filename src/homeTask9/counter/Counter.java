package homeTask9.counter;

import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by Юля on 25.03.2016.
 */
public class Counter {
    private Instant begin;
    private Instant end;
    Instant mill;

    public long pushToTheEnd(List list, Object element) {
        begin = Instant.now();
        list.add(element);
        end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        return milliseconds;
    }

    public long pushToTheBegin(List list, Object element) {
        begin = Instant.now();
        list.add(0, element);
        end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        return milliseconds;
    }

    public long pushToSet(Set set, Object element) {
        begin = Instant.now();
        set.add(element);
        end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        return milliseconds;
    }

    public long search(Collection collection, Object element) {
        begin = Instant.now();
        collection.contains(element);
        end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        return milliseconds;
    }

    public long searchByIndex(List list, int index) {
        begin = Instant.now();
        list.get(index);
        end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        return milliseconds;
    }

    public long remove(Collection collection, Object object) {
        begin = Instant.now();
        collection.remove(object);
        end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        return milliseconds;
    }

    public long removeFromBgin(Collection list) {
        begin = Instant.now();
        list.remove(0);
        end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        return milliseconds;
    }

    public long removeFromMiddle(Collection list) {
        begin = Instant.now();
        list.remove(list.size() / 2);
        end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        return milliseconds;
    }

    public long removeFromEnd(Collection list) {
        begin = Instant.now();
        list.remove(list.size() - 1);
        end = Instant.now();
        long milliseconds = Duration.between(begin, end).toMillis();
        return milliseconds;
    }


}
