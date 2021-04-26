public class Iterative {

    public static BitList complement( BitList in ) {
        BitList result;
        result = new BitList();

                Iterator i = in.iterator();
        Iterator j = result.iterator();

        if ( ! i.hasNext() ) {   
            j.add( BitList.ONE );

        } else {
