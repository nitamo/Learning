<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1483383927217" ID="ID_1583783639" MODIFIED="1483383931469" TEXT="NIO">
<node CREATED="1483383988611" FOLDED="true" ID="ID_994222713" LINK="https://docs.oracle.com/javase/8/docs/api/java/nio/file/Paths.html" MODIFIED="1483570010414" POSITION="right" TEXT="Paths">
<node CREATED="1483383992690" ID="ID_1913893655" MODIFIED="1483384001936" TEXT="java.nio.files.Paths"/>
<node CREATED="1483384028332" ID="ID_1109145854" MODIFIED="1483384041594" TEXT="get(String p) : Path"/>
<node CREATED="1483384042476" ID="ID_1946543358" MODIFIED="1483384058735" TEXT="get(Sring... vargs) : Path"/>
<node CREATED="1483384059656" ID="ID_719335864" MODIFIED="1483384071359" TEXT="get(URI u) : Path"/>
</node>
<node CREATED="1483383933119" FOLDED="true" ID="ID_1849853405" LINK="https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html" MODIFIED="1483570001274" POSITION="right" TEXT="Path">
<node CREATED="1483383944081" ID="ID_1079711102" MODIFIED="1483383963864" TEXT="java.nio.file.Path"/>
<node CREATED="1483384109763" ID="ID_1616943420" MODIFIED="1483384118353" TEXT="toURI() : URI"/>
<node CREATED="1483388454445" ID="ID_783672787" MODIFIED="1483388459415" TEXT="toFile() : File"/>
<node CREATED="1483389098721" ID="ID_1962157108" MODIFIED="1483564557962" TEXT="isAbsolute() : boolean"/>
<node CREATED="1483388981059" ID="ID_1457704078" MODIFIED="1483388988258" TEXT="getNameCount() : int"/>
<node CREATED="1483388988899" ID="ID_1892855720" MODIFIED="1483389012739" TEXT="getName(int n) : Path"/>
<node CREATED="1483389050073" ID="ID_19102785" MODIFIED="1483389059751" TEXT="getFileName() : Path"/>
<node CREATED="1483389060408" ID="ID_1512187080" MODIFIED="1483389065111" TEXT="getRoot() : Path">
<node CREATED="1483389074540" ID="ID_1510054824" MODIFIED="1483389077386" TEXT="or null"/>
</node>
<node CREATED="1483565124452" ID="ID_1533067597" MODIFIED="1483565130669" TEXT="normalize() : Path"/>
<node CREATED="1483389154642" ID="ID_517117725" MODIFIED="1483564554233" TEXT="subpath(int s, int f) : Path">
<node CREATED="1483389382150" ID="ID_30490109" MODIFIED="1483389395867" TEXT="throws IllegalArgumetException"/>
</node>
<node CREATED="1483564566074" ID="ID_1159250427" MODIFIED="1483564659069" TEXT="relativize(Path p) : Path"/>
<node CREATED="1483564629395" ID="ID_810979391" MODIFIED="1483564637485" TEXT="resolve(Path p) : Path"/>
<node CREATED="1483389106656" ID="ID_27477290" MODIFIED="1483389120367" TEXT="toAbsolutePath() : Path"/>
<node CREATED="1483565146417" ID="ID_1824196003" MODIFIED="1483565153944" TEXT="toRealPath() : Path"/>
</node>
<node CREATED="1483384119902" ID="ID_1541863844" LINK="https://docs.oracle.com/javase/8/docs/api/java/net/URI.html" MODIFIED="1483384183657" POSITION="left" TEXT="URI"/>
<node CREATED="1483388463448" FOLDED="true" ID="ID_1806994834" MODIFIED="1483388484536" POSITION="left" TEXT="File">
<node CREATED="1483388467436" ID="ID_1760410512" MODIFIED="1483388473079" TEXT="toPath() : Path"/>
</node>
<node CREATED="1483388303230" FOLDED="true" ID="ID_501746715" MODIFIED="1483570054075" POSITION="left" TEXT="FileSystem">
<node CREATED="1483388351168" ID="ID_1939776632" MODIFIED="1483388360871" TEXT="getPath(String p) : Path"/>
<node CREATED="1483570024301" ID="ID_499585572" MODIFIED="1483570045091" TEXT="getPrincipalLookupService() : PrincipalLookupService"/>
</node>
<node CREATED="1483388307384" FOLDED="true" ID="ID_1106699248" MODIFIED="1483570056683" POSITION="left" TEXT="FileSystems">
<node CREATED="1483388330464" ID="ID_984793253" MODIFIED="1483388338462" TEXT="getDefault() : FileSystem"/>
<node CREATED="1483388413594" ID="ID_1146604258" MODIFIED="1483388433769" TEXT="getFileSystem(URI u) : FileSystem"/>
</node>
<node CREATED="1483565194379" FOLDED="true" ID="ID_1615175087" LINK="https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html" MODIFIED="1483570012394" POSITION="right" TEXT="Files">
<node CREATED="1483567983921" ID="ID_1225525503" MODIFIED="1483567995746" TEXT="copy(Path p1, Path p2)"/>
<node CREATED="1483568064848" ID="ID_578297755" MODIFIED="1483568151943" TEXT="copy(InputStream is, Path p) : long"/>
<node CREATED="1483568080570" ID="ID_1601783945" MODIFIED="1483568157167" TEXT="copy(Path p, OutputStream os) : long"/>
<node CREATED="1483567827409" ID="ID_1887551352" MODIFIED="1483567981371" TEXT="createDirectory(Path p)"/>
<node CREATED="1483567839511" ID="ID_89637164" MODIFIED="1483567981373" TEXT="createDirectories(Path p)"/>
<node CREATED="1483568358364" ID="ID_1846448403" MODIFIED="1483568365130" TEXT="delete(Path p)"/>
<node CREATED="1483568365793" ID="ID_675559252" MODIFIED="1483568381378" TEXT="deleteIfExists(Path p) : boolean"/>
<node CREATED="1483565203979" ID="ID_522928929" MODIFIED="1483568180396" TEXT="exists(Path p) : boolean"/>
<node CREATED="1483569588946" ID="ID_259289005" MODIFIED="1483569612997" TEXT="find(Path p, int depth, BiPredicate&lt;T, U&gt; pred)">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1483569361870" ID="ID_880220297" MODIFIED="1483569498319" TEXT="getFileAttributesView(Path p, Class&lt;A&gt; cls) : BasicFileAttributesView"/>
<node CREATED="1483568900650" ID="ID_518131724" MODIFIED="1483568911808" TEXT="getLastModifiedTime(Path p) : FileTime"/>
<node CREATED="1483569080705" ID="ID_1590453220" MODIFIED="1483569093159" TEXT="getOwner(Path p) : UserPrincipal"/>
<node CREATED="1483568741792" ID="ID_1868915273" MODIFIED="1483568754323" TEXT="isDirectory(Path p) : boolean"/>
<node CREATED="1483568839327" ID="ID_718498388" MODIFIED="1483568847597" TEXT="isExecutable(Path p) : boolean"/>
<node CREATED="1483568776449" ID="ID_653936308" MODIFIED="1483568788219" TEXT="isRegularFile(Path p) : boolean"/>
<node CREATED="1483568826935" ID="ID_605171151" MODIFIED="1483568836278" TEXT="isReadable(Path p) : boolean"/>
<node CREATED="1483568755188" ID="ID_320793388" MODIFIED="1483568769912" TEXT="isSymbolicLink(Path p) : boolean"/>
<node CREATED="1483565314547" ID="ID_1729186790" MODIFIED="1483568175494" TEXT="isSameFile(Path p1, Path p2) : boolean"/>
<node CREATED="1483569697094" ID="ID_880171013" MODIFIED="1483569711293" TEXT="lines(Path p) : Stream&lt;String&gt;">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1483569634525" ID="ID_1777954180" MODIFIED="1483569652975" TEXT="list(Path p) : Stream&lt;Path&gt;">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1483568182350" ID="ID_83625321" MODIFIED="1483568193108" TEXT="move(Path p1, Path p2)"/>
<node CREATED="1483568460564" ID="ID_1446615888" MODIFIED="1483568487142" TEXT="newBufferedReader(Path p, CharSet cs) : BufferedReader"/>
<node CREATED="1483568491632" ID="ID_144276732" MODIFIED="1483568511169" TEXT="newBufferedWriter(Path p, CharSet cs) : BufferedWriter"/>
<node CREATED="1483568539570" ID="ID_850423072" MODIFIED="1483568553104" TEXT="readAllLines(Path p) : List&lt;String&gt;"/>
<node CREATED="1483569361870" ID="ID_1365567829" MODIFIED="1483569437305" TEXT="readAttributes(Path p, Class&lt;A&gt; cls) : BasicFileAttributes"/>
<node CREATED="1483568914946" ID="ID_615946335" MODIFIED="1483568930744" TEXT="setLastModifiedTime(Path p, FileTime ft)"/>
<node CREATED="1483569099384" ID="ID_1903121959" MODIFIED="1483569113262" TEXT="setOwner(Path p, UserPrincipal up)"/>
<node CREATED="1483568861063" ID="ID_733822783" MODIFIED="1483568867102" TEXT="size(Path p) : long"/>
<node CREATED="1483569528452" ID="ID_1858934409" MODIFIED="1483569582435" TEXT="walk(Path p) : Stream&lt;Path&gt;">
<font BOLD="true" NAME="SansSerif" SIZE="12"/>
</node>
</node>
<node CREATED="1483388779344" FOLDED="true" ID="ID_1274946291" MODIFIED="1483570014776" POSITION="right" TEXT="Attributes">
<node CREATED="1483388783760" ID="ID_810588312" MODIFIED="1483388794103" TEXT="NOFOLLOW_LINKS"/>
<node CREATED="1483388794808" ID="ID_1615536139" MODIFIED="1483388798766" TEXT="FOLLOW_LINKS"/>
<node CREATED="1483388801824" ID="ID_1792064014" MODIFIED="1483388807246" TEXT="COPY_ATTRIBUTES"/>
<node CREATED="1483388810638" ID="ID_1992092244" MODIFIED="1483388816526" TEXT="REPLACE_EXISTING"/>
<node CREATED="1483388819141" ID="ID_300081040" MODIFIED="1483388823278" TEXT="ATOMIC_MOVE"/>
</node>
</node>
</map>
