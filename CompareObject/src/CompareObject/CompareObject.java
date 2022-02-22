package CompareObject;

import Circle.Circle;

public interface CompareObject {
    public int compareTo(Object o);//若返回值是0，代表相等；若为正数，代表当前对象大；否则代表当前对象小。

}
