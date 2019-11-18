package com.stepasha.artportfolio.services;

import com.stepasha.artportfolio.logging.Loggable;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

//TODO 15 Auditing

@Loggable
@Component
public class UserAuditing implements AuditorAware<String>
{
    @Override
    public Optional<String> getCurrentAuditor()
    {
        String uname;

        uname = "SYSTEM";

        return Optional.of(uname);
    }
}
