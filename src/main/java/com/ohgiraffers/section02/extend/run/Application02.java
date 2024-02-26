package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 와일드카드에 대해 이해할 수 있다. */
        /* 필기
        *   와일드카드(WildCard)
        *   제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
        *   그 객체의 타입 변수를 제한할 수 있다.
        *   <?> : 제한없음
        *   <? extends Type> : 와일드카드 상한제한(Type 과 Type 의 후손을 이용해 생성한 인스턴스만 가능
        *   <? super Type> : 와일드칻크 하한제한(Type과 Type의 부모를 이요해 생성한 인스턴스만 가능)
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();

//        wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));   // RabitFarm에서 토끼 하위만 제한을 걸어놨기 떄문에 불러올시, 그 하위만 불러와짐
//        wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));   // 얘도 마찬가지로 토끼의 후손이 아니라서 사용 불가

        /* 필기. 어떠한 토끼농장이던 상관없이 매개변수로 사용 가능 */       //wildFarm 참고하기
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /* 필기. Bunny이거나 Bunny의 후손들만 매개변수로 사용 가능하다. */
//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));  // Rabbit은 bunny의 조상이라 들어갈 수가 없다!
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /* 필기. Bunny이거나 Bunny의 부모들만 매개변수로 사용 가능하다. */
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));  // Bunny의 조상들만 가능하다고 지정해놔서 안됨~







    }
}
