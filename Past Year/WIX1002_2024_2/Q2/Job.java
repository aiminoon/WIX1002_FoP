package WIX1002_2024_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Job {
    private String jobName;
    private String partition;
    private String memory;
    private String qos;
}
