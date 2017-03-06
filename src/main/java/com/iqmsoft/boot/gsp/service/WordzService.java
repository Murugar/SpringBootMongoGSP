
package com.iqmsoft.boot.gsp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WordzService {

    @Value("${wordz.dict.version}")
    String dictionaryVersion;

    @Value("${wordz.dict.name}")
    String dictionaryName;

    
    
    public String version() {
        return dictionaryVersion;
    }
    
    public String name() {
        return dictionaryName;
    }
    
}
