<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1482331308413" ID="ID_1433276828" MODIFIED="1482763333968" TEXT="Collections">
<node COLOR="#006699" CREATED="1482331365774" FOLDED="true" ID="ID_540792361" MODIFIED="1482503612482" POSITION="right" TEXT="Base interfaces">
<node CREATED="1482331376678" ID="ID_408858189" MODIFIED="1482503607159" TEXT="Collection">
<node CREATED="1482331317132" ID="ID_1455760387" MODIFIED="1482331319058" TEXT="List">
<node CREATED="1482332217926" ID="ID_1337855143" MODIFIED="1482332220970" TEXT="ArrayList"/>
<node CREATED="1482332221422" ID="ID_673467332" MODIFIED="1482332225282" TEXT="LinkedList"/>
</node>
<node CREATED="1482331320918" ID="ID_180194489" MODIFIED="1482331322458" TEXT="Set">
<node CREATED="1482332901133" ID="ID_1546183777" MODIFIED="1482332905250" TEXT="HashSet"/>
<node CREATED="1482332964486" ID="ID_1878420785" MODIFIED="1482503573712" TEXT="TreeSet">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
<node CREATED="1482333822302" ID="ID_245846188" MODIFIED="1482333835338" TEXT="implements NavigableSet"/>
<node CREATED="1482503578055" ID="ID_639597102" MODIFIED="1482503586189" TEXT="requires Comparable"/>
</node>
</node>
<node CREATED="1482331327910" ID="ID_1644399192" MODIFIED="1482331332899" TEXT="Queue">
<node CREATED="1482332289453" ID="ID_1974770284" MODIFIED="1482332292434" TEXT="LinkedList"/>
<node CREATED="1482496180714" ID="ID_1502865418" MODIFIED="1482496200723" TEXT="ArrayDeque">
<node CREATED="1482496944109" ID="ID_458127815" MODIFIED="1482496962115" TEXT="more efficient than LinkedList"/>
<node CREATED="1482496963061" ID="ID_1016646133" MODIFIED="1482496975643" TEXT="stores in resizable Array"/>
</node>
</node>
</node>
<node CREATED="1482331347222" ID="ID_9886275" MODIFIED="1482503608691" TEXT="Map">
<node CREATED="1482497814476" ID="ID_515435288" MODIFIED="1482497818066" TEXT="HashMap"/>
<node CREATED="1482497826181" ID="ID_1483884325" MODIFIED="1482503571413" TEXT="TreeMap">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
<node CREATED="1482503589468" ID="ID_1870480021" MODIFIED="1482503596244" TEXT="requires Comparable"/>
</node>
<node CREATED="1482497866238" ID="ID_468516543" MODIFIED="1482497871332" TEXT="LinkedHashMap"/>
</node>
</node>
<node COLOR="#006699" CREATED="1482331453894" FOLDED="true" ID="ID_679728943" LINK="https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html" MODIFIED="1482763336662" POSITION="left" TEXT="Common collection methods">
<node CREATED="1482331462750" ID="ID_1943861096" MODIFIED="1482331476379" TEXT="add(E el) : boolean"/>
<node CREATED="1482504972161" ID="ID_1531674073" MODIFIED="1482763018141" TEXT="removeIf(Predicate filter) : boolean">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1482331477357" ID="ID_1060032089" MODIFIED="1482331489218" TEXT="remove(Object o) : boolean"/>
<node CREATED="1482763043066" ID="ID_1562176695" MODIFIED="1482763057225" TEXT="replaceAll(UnaryOperator o)">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1482763089085" ID="ID_438533688" MODIFIED="1482763100278" TEXT="forEach(Consumer c)">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1482331592150" ID="ID_1264669271" MODIFIED="1482331600434" TEXT="isEmpty() : boolean"/>
<node CREATED="1482331601182" ID="ID_1663524423" MODIFIED="1482331606922" TEXT="size() : int"/>
<node CREATED="1482331623357" ID="ID_960215099" MODIFIED="1482331627290" TEXT="clear()"/>
<node CREATED="1482331638133" ID="ID_459851805" MODIFIED="1482331647674" TEXT="contains(Object o) : boolean"/>
</node>
<node CREATED="1482332426454" FOLDED="true" ID="ID_1532890621" MODIFIED="1482496324675" POSITION="right" TEXT="List">
<node CREATED="1482332429541" ID="ID_1472152511" MODIFIED="1482332437715" TEXT="add(E e) : boolean"/>
<node CREATED="1482332438341" ID="ID_1329218672" MODIFIED="1482332452002" TEXT="add(int index, E e) : boolean"/>
<node CREATED="1482332456685" ID="ID_1279450747" MODIFIED="1482332464738" TEXT="get(int index) : E"/>
<node CREATED="1482332465365" ID="ID_1818815385" MODIFIED="1482332476378" TEXT="indexOf(Object o) : int">
<node CREATED="1482332501326" ID="ID_89792936" MODIFIED="1482332506706" TEXT="-1 if not found"/>
</node>
<node CREATED="1482332484382" ID="ID_1256704289" MODIFIED="1482332496898" TEXT="lastIndexOf(Object o) : int">
<node CREATED="1482332508006" ID="ID_1493708064" MODIFIED="1482332512002" TEXT="-1 if not found"/>
</node>
<node CREATED="1482332523102" ID="ID_1096796115" MODIFIED="1482332532002" TEXT="remove(int index)"/>
<node CREATED="1482332534862" ID="ID_276769314" MODIFIED="1482332545674" TEXT="set(int index, E e) : E"/>
</node>
<node CREATED="1482333838862" FOLDED="true" ID="ID_598102752" MODIFIED="1482762844785" POSITION="left" TEXT="NavigableSet">
<node CREATED="1482333853326" ID="ID_788215616" MODIFIED="1482333861562" TEXT="lower(E e) : E"/>
<node CREATED="1482333863926" ID="ID_640527320" MODIFIED="1482333870514" TEXT="floor(E e) : E"/>
<node CREATED="1482333871269" ID="ID_1342860080" MODIFIED="1482333898842" TEXT="ceiling(E e) : E"/>
<node CREATED="1482333881622" ID="ID_967687576" MODIFIED="1482333894698" TEXT="higher(E e) : E"/>
</node>
<node CREATED="1482496336810" FOLDED="true" ID="ID_224986817" MODIFIED="1482503603687" POSITION="right" TEXT="Queue">
<node CREATED="1482496345350" ID="ID_1453784722" MODIFIED="1482496356293" TEXT="add(E el) : boolean">
<node CREATED="1482496365805" ID="ID_456041498" MODIFIED="1482496379519" TEXT="adds to the back of the queue"/>
</node>
<node CREATED="1482496388776" ID="ID_213762963" MODIFIED="1482496402345" TEXT="element() : E">
<node CREATED="1482496403066" ID="ID_1714222251" MODIFIED="1482496425304" TEXT="returns next element or throws an exception"/>
</node>
<node CREATED="1482496436665" ID="ID_1643415234" MODIFIED="1482496447887" TEXT="offer(E el) : boolean">
<node CREATED="1482496477328" ID="ID_741592320" MODIFIED="1482496487086" TEXT="adds to the back of the queue"/>
</node>
<node CREATED="1482496531432" ID="ID_483946634" MODIFIED="1482496536079" TEXT="remove() : E">
<node CREATED="1482496541544" ID="ID_1923671297" MODIFIED="1482496566038" TEXT="removes, returns next element, throws"/>
</node>
<node CREATED="1482496573915" ID="ID_995066391" MODIFIED="1482496766336" STYLE="fork" TEXT="push(E el)">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
<node CREATED="1482496585363" ID="ID_869762703" MODIFIED="1482496760423" TEXT="adds to the front of the queue"/>
<node CREATED="1482496602893" ID="ID_1565454614" MODIFIED="1482496777997" TEXT="fits for Stack">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1482496992400" ID="ID_1861181505" MODIFIED="1482497006240" TEXT="only in ArrayDeque">
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
</node>
<node CREATED="1482496617097" ID="ID_1927770884" MODIFIED="1482496622408" TEXT="poll() : E">
<node CREATED="1482496624461" ID="ID_746204534" MODIFIED="1482496632736" TEXT="removes, returns next element"/>
</node>
<node CREATED="1482496652168" ID="ID_645779787" MODIFIED="1482496769044" TEXT="peek() : E">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
<node CREATED="1482496657350" ID="ID_1392769455" MODIFIED="1482496664415" TEXT="returns next element"/>
<node CREATED="1482496668296" ID="ID_14800379" MODIFIED="1482496779304" TEXT="fits for Stack">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
</node>
<node CREATED="1482496679638" ID="ID_1108473105" MODIFIED="1482496770261" TEXT="pop() : E">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
<node CREATED="1482496541544" ID="ID_995938169" MODIFIED="1482496566038" TEXT="removes, returns next element, throws"/>
<node CREATED="1482496720500" ID="ID_222663644" MODIFIED="1482496780252" TEXT="only for Stack">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
</node>
</node>
<node CREATED="1482498032354" ID="ID_1700660094" LINK="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html" MODIFIED="1482763354310" POSITION="right" TEXT="Map">
<node CREATED="1482498041218" ID="ID_1793246670" MODIFIED="1482498056781" TEXT="clear()"/>
<node CREATED="1482763697631" ID="ID_1889456518" MODIFIED="1482763710832" TEXT="computeIfAbsent(K key, Function&lt;&gt; f) : V">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1482763720991" ID="ID_196607270" MODIFIED="1482763736001" TEXT="computeIfPresent(K key, BiFunction&lt;&gt; f) : V">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1482498058042" ID="ID_1338766720" MODIFIED="1482498068844" TEXT="isEmpty() : boolean"/>
<node CREATED="1482498074366" ID="ID_163380590" MODIFIED="1482498080116" TEXT="size() : int"/>
<node CREATED="1482498084797" ID="ID_1823862822" MODIFIED="1482498093820" TEXT="get(K key) : V"/>
<node CREATED="1482763540368" ID="ID_1795411699" MODIFIED="1482763563625" TEXT="merge(K key, V value, BiFunction&lt;&gt; f) : V">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1482498102962" ID="ID_729238660" MODIFIED="1482498112624" TEXT="put(K key, V value) : V"/>
<node CREATED="1482763368391" ID="ID_632235205" MODIFIED="1482763382356" TEXT="putIfAbsent(K key, V value) : V"/>
<node CREATED="1482498122716" ID="ID_424435825" MODIFIED="1482498139674" TEXT="remove(K key) : V"/>
<node CREATED="1482498259477" ID="ID_969361492" MODIFIED="1482498271288" TEXT="containsKey(K key) : boolean"/>
<node CREATED="1482498272257" ID="ID_874178385" MODIFIED="1482498284791" TEXT="containsValue(V value) : boolean"/>
<node CREATED="1482498295591" ID="ID_1835262228" MODIFIED="1482498304494" TEXT="keySet() : Set&lt;K&gt;"/>
<node CREATED="1482498305106" ID="ID_247757524" MODIFIED="1482498314389" TEXT="values() : Collection&lt;V&gt;"/>
</node>
<node COLOR="#0033ff" CREATED="1482501066456" FOLDED="true" ID="ID_906778663" MODIFIED="1482502970874" POSITION="left" TEXT="Comparable&lt;T&gt;">
<node COLOR="#006699" CREATED="1482501341976" ID="ID_850389012" MODIFIED="1482501590249" TEXT="Meta">
<node CREATED="1482501345568" ID="ID_1340152200" MODIFIED="1482501381266" TEXT="(i - a.i) -&gt; Ascending"/>
<node CREATED="1482501360028" ID="ID_1270068971" MODIFIED="1482501390266" TEXT="(a.i - 1) -&gt; Descending"/>
<node CREATED="1482501408251" ID="ID_1207797335" MODIFIED="1482501562830" TEXT="">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <table border="0" style="border-left-style: solid; width: 80%; border-right-width: 0; border-top-style: solid; border-bottom-style: solid; border-right-style: solid; border-left-width: 0; border-bottom-width: 0; border-top-width: 0">
      <tr>
        <td valign="top" style="border-left-style: solid; width: 33%; border-right-width: 1; border-top-style: solid; border-bottom-style: solid; border-right-style: solid; border-left-width: 1; border-bottom-width: 1; border-top-width: 1">
          <p style="margin-top: 1; margin-right: 1; margin-left: 1; margin-bottom: 1">
            Way of comparison
          </p>
        </td>
        <td valign="top" style="border-left-style: solid; width: 33%; border-right-width: 1; border-top-style: solid; border-bottom-style: solid; border-right-style: solid; border-left-width: 1; border-bottom-width: 1; border-top-width: 1">
          <p style="margin-top: 1; margin-right: 1; margin-left: 1; margin-bottom: 1">
            Result
          </p>
        </td>
        <td valign="top" style="border-left-style: solid; width: 33%; border-right-width: 1; border-top-style: solid; border-bottom-style: solid; border-right-style: solid; border-left-width: 1; border-bottom-width: 1; border-top-width: 1">
          <p style="margin-top: 1; margin-right: 1; margin-left: 1; margin-bottom: 1">
            Order
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-left-style: solid; width: 33%; border-right-width: 1; border-top-style: solid; border-bottom-style: solid; border-right-style: solid; border-left-width: 1; border-bottom-width: 1; border-top-width: 1">
          <p style="margin-top: 1; margin-right: 1; margin-left: 1; margin-bottom: 1">
            i1 - i2 (i - a.i)
          </p>
        </td>
        <td valign="top" style="border-left-style: solid; width: 33%; border-right-width: 1; border-top-style: solid; border-bottom-style: solid; border-right-style: solid; border-left-width: 1; border-bottom-width: 1; border-top-width: 1">
          <p style="margin-top: 1; margin-right: 1; margin-left: 1; margin-bottom: 1">
            10 - 15 = -5
          </p>
        </td>
        <td valign="top" style="border-left-style: solid; width: 33%; border-right-width: 1; border-top-style: solid; border-bottom-style: solid; border-right-style: solid; border-left-width: 1; border-bottom-width: 1; border-top-width: 1">
          <p style="margin-top: 1; margin-right: 1; margin-left: 1; margin-bottom: 1">
            Ascending
          </p>
        </td>
      </tr>
      <tr>
        <td valign="top" style="border-left-style: solid; width: 33%; border-right-width: 1; border-top-style: solid; border-bottom-style: solid; border-right-style: solid; border-left-width: 1; border-bottom-width: 1; border-top-width: 1">
          <p style="margin-top: 1; margin-right: 1; margin-left: 1; margin-bottom: 1">
            i2 - i1 (a.i - i)
          </p>
        </td>
        <td valign="top" style="border-left-style: solid; width: 33%; border-right-width: 1; border-top-style: solid; border-bottom-style: solid; border-right-style: solid; border-left-width: 1; border-bottom-width: 1; border-top-width: 1">
          <p style="margin-top: 1; margin-right: 1; margin-left: 1; margin-bottom: 1">
            15 - 10 = 5
          </p>
        </td>
        <td valign="top" style="border-left-style: solid; width: 33%; border-right-width: 1; border-top-style: solid; border-bottom-style: solid; border-right-style: solid; border-left-width: 1; border-bottom-width: 1; border-top-width: 1">
          <p style="margin-top: 1; margin-right: 1; margin-left: 1; margin-bottom: 1">
            Descending
          </p>
        </td>
      </tr>
    </table>
  </body>
</html></richcontent>
</node>
</node>
<node CREATED="1482501145526" ID="ID_1595862504" MODIFIED="1482501169828" TEXT="comparteTo(T o) : int"/>
</node>
<node COLOR="#0033ff" CREATED="1482501929121" FOLDED="true" ID="ID_1142321090" LINK="https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html" MODIFIED="1482502984291" POSITION="left" TEXT="Comparator&lt;T&gt;">
<node CREATED="1482501952228" ID="ID_952202381" MODIFIED="1482501988822" TEXT="compare(T a, T b) : int"/>
<node CREATED="1482502465049" ID="ID_1407235855" MODIFIED="1482502612273" TEXT="comparing(Function f) : Comparator&lt;T&gt;"/>
<node CREATED="1482502565900" ID="ID_1627839285" MODIFIED="1482502579146" TEXT="naturalOrder() : Comparator&lt;T&gt;"/>
<node CREATED="1482502639457" ID="ID_1275135185" MODIFIED="1482502652052" TEXT="reverseOrder() : Comparator&lt;T&gt;"/>
<node CREATED="1482502655551" ID="ID_1817783045" MODIFIED="1482502663517" TEXT="reversed() : Comparator&lt;T&gt;"/>
<node CREATED="1482502671532" ID="ID_1230839012" MODIFIED="1482502690770" TEXT="thenComparing(Function f) : Comparator&lt;T&gt;"/>
<node CREATED="1482502882888" ID="ID_263349131" MODIFIED="1482502909083" TEXT="nullsFirst(Comparator&lt;T&gt; c) : Comparator&lt;T&gt;"/>
<node CREATED="1482502882888" ID="ID_1729474531" MODIFIED="1482502934502" TEXT="nullsLast(Comparator&lt;T&gt; c) : Comparator&lt;T&gt;"/>
</node>
<node CREATED="1482503120792" FOLDED="true" ID="ID_1263589087" MODIFIED="1482763322535" POSITION="right" TEXT="Collections">
<node CREATED="1482503129159" ID="ID_660483981" MODIFIED="1482503323277" TEXT="sort(Collection&lt;? extends Comparable&gt; c)"/>
<node CREATED="1482503193285" ID="ID_1418503853" MODIFIED="1482503296577" TEXT="sort(Collection&lt;T&gt; c1, Comparator&lt;T&gt;  c2)"/>
<node CREATED="1482503635863" ID="ID_523224513" MODIFIED="1482503680077" TEXT="binarySearch(Collection&lt;T&gt; col, T item, Comparator&lt;T&gt;)"/>
</node>
</node>
</map>
