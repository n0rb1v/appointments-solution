package nav;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class NavService {
    private List<Type> types = Arrays.asList(new Type("001","Adobevallas"),
            new Type("002","Befizetes"));

    public List<Type> getTypes() {
        return types;
    }

    public boolean hasValidType(String s) {
        return types.stream().anyMatch(type -> type.getCode().equals(s));
    }
}

