package Package;
import java.util.Comparator;

public class Sistema  implements Comparator<Paciente>{
    @Override
    public int compare(Paciente o1, Paciente o2) {
         return o1.getPosicaoFila() < o2.getPosicaoFila() ? 1 : -1;
    }
}    

