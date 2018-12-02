@XmlJavaTypeAdapters({
        @XmlJavaTypeAdapter(type=LocalDate.class,
                value=LocalDateAdapter.class),
})

package com.vis.demo.model;

import com.vis.demo.adapters.LocalDateAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.time.LocalDate;