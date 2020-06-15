package com.conectarSalud.model.consultation

import java.util.*

data class consultationDTO (
    val date: String,
    val patientFirstName: String,
    val patientLastName: String,
    val doctorFirstName: String,
    val doctorLastName: String,
    val doctorSpecialities: Array<String>,
    val symptoms: Array<String>,
    val hasPrescription: Boolean,
    val indications: String? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as consultationDTO

        if (date != other.date) return false
        if (patientFirstName != other.patientFirstName) return false
        if (patientLastName != other.patientLastName) return false
        if (doctorFirstName != other.doctorFirstName) return false
        if (doctorLastName != other.doctorLastName) return false
        if (!doctorSpecialities.contentEquals(other.doctorSpecialities)) return false
        if (!symptoms.contentEquals(other.symptoms)) return false
        if (hasPrescription != other.hasPrescription) return false
        if (indications != other.indications) return false

        return true
    }

    override fun hashCode(): Int {
        var result = date.hashCode()
        result = 31 * result + patientFirstName.hashCode()
        result = 31 * result + patientLastName.hashCode()
        result = 31 * result + doctorFirstName.hashCode()
        result = 31 * result + doctorLastName.hashCode()
        result = 31 * result + doctorSpecialities.contentHashCode()
        result = 31 * result + symptoms.contentHashCode()
        result = 31 * result + hasPrescription.hashCode()
        result = 31 * result + (indications?.hashCode() ?: 0)
        return result
    }
}